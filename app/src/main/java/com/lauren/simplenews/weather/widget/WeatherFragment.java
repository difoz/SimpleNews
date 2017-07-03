package com.lauren.simplenews.weather.widget;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.lauren.simplenews.R;
import com.lauren.simplenews.main.widget.MainActivity;
import com.lauren.simplenews.weather.widget.gson.Weather_gson;
import com.lauren.simplenews.weather.widget.utils.HttpUtil;
import com.lauren.simplenews.weather.widget.wea_area_item.AreaFragment;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


public class WeatherFragment extends Fragment
{
    private Weather_gson weatherInfo_array;
    private TextView overall_temp;
    private TextView title;
    private TextView update_time;
    private TextView aq_indicator;
    private TextView pm25;
    private TextView advise_comfort;
    private TextView advise_carwash;
    private TextView advise_sport;
    private LinearLayout forcast_head;
    private TextView overall_weather;
    private ImageView image;
    private SwipeRefreshLayout refresh_swipe;
    private String url_for_swiperefresh;
    private SharedPreferences config;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_weather, null);
        FloatingActionButton floatbtn = (FloatingActionButton) view.findViewById(R.id.weaFrag_floatBtn);
        config = getActivity().getSharedPreferences("config", Context.MODE_PRIVATE);
        //浮动按钮的点击监听
        floatbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //通过getActivity()方法获得活动，从而调用活动中的方法。
                MainActivity activity = (MainActivity) getActivity();
                FragmentTransaction replace = activity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new AreaFragment());
                //往栈内空间存储
                //replace.addToBackStack(null);
                replace.commit();
            }
        });
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            url_for_swiperefresh = bundle.getString("Data");
            config.edit().putString("Data", url_for_swiperefresh).commit();
        }

        /**
         * findview
         */
        //drawer_layout = (DrawerLayout) view.findViewById(R.id.drawer_layout);
        /*下拉刷新功能*/
        refresh_swipe = (SwipeRefreshLayout) view.findViewById(R.id.refresh_swipelayout);
        refresh_swipe.setColorSchemeResources(R.color.colorPrimary);
        refresh_swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener()
        {
            @Override
            public void onRefresh()
            {
                url_for_swiperefresh = config.getString("Data", "");
                RequestLocalWeather(url_for_swiperefresh);
            }
        });

        overall_temp = (TextView) view.findViewById(R.id.mian_overall_tempature);
        title = (TextView) view.findViewById(R.id.main_title_title);
        update_time = (TextView) view.findViewById(R.id.update_time);
        //findViewById(R.id.btn_main_house).setOnClickListener(this);
        aq_indicator = (TextView) view.findViewById(R.id.main_airquality_aqiIndicater);
        pm25 = (TextView) view.findViewById(R.id.main_airquality_pm25);
        advise_comfort = (TextView) view.findViewById(R.id.main_advise_comfort);
        advise_carwash = (TextView) view.findViewById(R.id.main_advise_carwash);
        advise_sport = (TextView) view.findViewById(R.id.main_advise_sport);
        forcast_head = (LinearLayout) view.findViewById(R.id.main_forcast_list);
        overall_weather = (TextView) view.findViewById(R.id.main_overall_weather);
        //image = (ImageView) view.findViewById(R.id.bing_pic);
        String data = config.getString("Data", "");
        RequestLocalWeather(data);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
    }


    /*通过fragment传过来网址链接 从而解析当地天气情况*/
    public void RequestLocalWeather(final String localWeatherURL)
    {
        url_for_swiperefresh = localWeatherURL;
        HttpUtil.sendOkHttpRequset(localWeatherURL, new Callback()
        {
            @Override
            public void onFailure(Call call, IOException e)
            {
                getActivity().runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Toast.makeText(getActivity(), "获取局地天气信息网络出现问题！", Toast.LENGTH_LONG).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException
            {
                String string = response.body().string();
                //config.edit().putString("weather_data", localWeatherURL).commit();
                Gson gson = new Gson();
                weatherInfo_array = gson.fromJson(string, Weather_gson.class);
                getActivity().runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        if (weatherInfo_array.getHeWeather().get(0).getStatus().equals("ok"))
                        {
                            ShowWeatherInfo(weatherInfo_array);
                        } else
                        {
                            Toast.makeText(getActivity(), "getStatus 数值不为‘ok’检查！", Toast.LENGTH_LONG).show();
                        }
                        refresh_swipe.setRefreshing(false);
                    }
                });
            }
        });
    }

    private void ShowWeatherInfo(Weather_gson weatherInfo)
    {
        /*当前地域*/
        Weather_gson.HeWeatherBean Info_weather_resolved = weatherInfo.getHeWeather().get(0);
        title.setText(Info_weather_resolved.getBasic().getCity());
        /*设置总温度*/
        overall_temp.setText(Info_weather_resolved.getNow().getTmp() + "℃");
        overall_weather.setText(Info_weather_resolved.getDaily_forecast().get(0).getCond().getTxt_d());
        /*更新时间*/
        update_time.setText(Info_weather_resolved.getBasic().getUpdate().getLoc());
        /*空气质量*/
        if (Info_weather_resolved.getAqi() != null)
        {
            aq_indicator.setText(Info_weather_resolved.getAqi().getCity().getAqi());
            pm25.setText(Info_weather_resolved.getAqi().getCity().getPm25());
        } else
        {
            aq_indicator.setText("-");
            pm25.setText("-");
        }

        /*生活指数*/
        advise_comfort.setText("舒适度指数：" + Info_weather_resolved.getSuggestion().getComf().getTxt());
        advise_carwash.setText("洗车指数：" + Info_weather_resolved.getSuggestion().getCw().getTxt());
        advise_sport.setText("运动指数：" + Info_weather_resolved.getSuggestion().getSport().getTxt());

        /*预报未来天气状况*/
        /*首先将之间的 view 都移除掉*/
        forcast_head.removeAllViews();
        int size = Info_weather_resolved.getDaily_forecast().size();
        for (int i = 0; i < size; i++)
        {
            /*动态向母线性布局中添加子线性布局*/
            View view = LayoutInflater.from(getContext()).inflate(R.layout.forcast_item, forcast_head, false);
            /*别忘了 "view." */
            TextView item_date = (TextView) view.findViewById(R.id.forcast_item_date);
            TextView item_weather = (TextView) view.findViewById(R.id.forcast_item_weather);
            TextView item_maxtemp = (TextView) view.findViewById(R.id.forcast_max_temp);
            TextView item_mintemp = (TextView) view.findViewById(R.id.forcast_min_temp);

            item_date.setText(Info_weather_resolved.getDaily_forecast().get(i).getDate());
            item_maxtemp.setText(Info_weather_resolved.getDaily_forecast().get(i).getTmp().getMax());
            item_mintemp.setText(Info_weather_resolved.getDaily_forecast().get(i).getTmp().getMin());
            item_weather.setText(Info_weather_resolved.getDaily_forecast().get(i).getCond().getTxt_d());
            forcast_head.addView(view);
        }

        /*fragment 与 activity 之间的通信*/
        /*AreaFragment Right_Frag = (AreaFragment) getSupportFragmentManager().findFragmentById(R.id.left_framelayout);
        Right_Frag.CloseProgressDialog();*/
    }
}
