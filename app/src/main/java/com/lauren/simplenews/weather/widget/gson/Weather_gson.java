package com.lauren.simplenews.weather.widget.gson;

import java.util.List;

/**
 * Created by work on 2017/3/6.
 */
public class Weather_gson
{

    private List<HeWeatherBean> HeWeather;

    public List<HeWeatherBean> getHeWeather()
    {
        return HeWeather;
    }

    public void setHeWeather(List<HeWeatherBean> HeWeather)
    {
        this.HeWeather = HeWeather;
    }

    public static class HeWeatherBean
    {
        /**
         * aqi : {"city":{"aqi":"33","pm10":"33","pm25":"7","qlty":"优"}}
         * basic : {"city":"海淀","cnty":"中国","id":"CN101010200","lat":"39.590000","lon":"116.170000","update":{"loc":"2017-03-07 18:51","utc":"2017-03-07 10:51"}}
         * daily_forecast : [{"astro":{"mr":"12:48","ms":"02:35","sr":"06:38","ss":"18:13"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2017-03-07","hum":"22","pcpn":"0.0","pop":"0","pres":"1025","tmp":{"max":"10","min":"0"},"uv":"3","vis":"10","wind":{"deg":"204","dir":"北风","sc":"微风","spd":"10"}},{"astro":{"mr":"13:48","ms":"03:31","sr":"06:37","ss":"18:14"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2017-03-08","hum":"23","pcpn":"0.0","pop":"0","pres":"1021","tmp":{"max":"14","min":"2"},"uv":"3","vis":"10","wind":{"deg":"321","dir":"北风","sc":"微风","spd":"7"}},{"astro":{"mr":"14:50","ms":"04:20","sr":"06:35","ss":"18:15"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2017-03-09","hum":"19","pcpn":"0.0","pop":"0","pres":"1018","tmp":{"max":"16","min":"2"},"uv":"4","vis":"10","wind":{"deg":"300","dir":"北风","sc":"微风","spd":"3"}}]
         * hourly_forecast : [{"cond":{"code":"100","txt":"晴"},"date":"2017-03-07 19:00","hum":"21","pop":"0","pres":"1023","tmp":"4","wind":{"deg":"326","dir":"西北风","sc":"3-4","spd":"21"}},{"cond":{"code":"100","txt":"晴"},"date":"2017-03-07 22:00","hum":"26","pop":"0","pres":"1024","tmp":"2","wind":{"deg":"309","dir":"西北风","sc":"微风","spd":"13"}}]
         * now : {"cond":{"code":"100","txt":"晴"},"fl":"1","hum":"19","pcpn":"0","pres":"1022","tmp":"6","vis":"10","wind":{"deg":"320","dir":"北风","sc":"5-6","spd":"33"}}
         * status : ok
         * suggestion : {"air":{"brf":"很差","txt":"气象条件不利于空气污染物稀释、扩散和清除，请尽量避免在室外长时间活动。"},"comf":{"brf":"较舒适","txt":"白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"drsg":{"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},"flu":{"brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},"sport":{"brf":"较适宜","txt":"天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意避风保暖。"},"trav":{"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"},"uv":{"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}}
         */

        private AqiBean aqi;
        private BasicBean basic;
        private NowBean now;
        private String status;
        private SuggestionBean suggestion;
        private List<DailyForecastBean> daily_forecast;
        private List<HourlyForecastBean> hourly_forecast;

        public AqiBean getAqi()
        {
            return aqi;
        }

        public void setAqi(AqiBean aqi)
        {
            this.aqi = aqi;
        }

        public BasicBean getBasic()
        {
            return basic;
        }

        public void setBasic(BasicBean basic)
        {
            this.basic = basic;
        }

        public NowBean getNow()
        {
            return now;
        }

        public void setNow(NowBean now)
        {
            this.now = now;
        }

        public String getStatus()
        {
            return status;
        }

        public void setStatus(String status)
        {
            this.status = status;
        }

        public SuggestionBean getSuggestion()
        {
            return suggestion;
        }

        public void setSuggestion(SuggestionBean suggestion)
        {
            this.suggestion = suggestion;
        }

        public List<DailyForecastBean> getDaily_forecast()
        {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast)
        {
            this.daily_forecast = daily_forecast;
        }

        public List<HourlyForecastBean> getHourly_forecast()
        {
            return hourly_forecast;
        }

        public void setHourly_forecast(List<HourlyForecastBean> hourly_forecast)
        {
            this.hourly_forecast = hourly_forecast;
        }

        public static class AqiBean
        {
            /**
             * city : {"aqi":"33","pm10":"33","pm25":"7","qlty":"优"}
             */

            private CityBean city;

            public CityBean getCity()
            {
                return city;
            }

            public void setCity(CityBean city)
            {
                this.city = city;
            }

            public static class CityBean
            {
                /**
                 * aqi : 33
                 * pm10 : 33
                 * pm25 : 7
                 * qlty : 优
                 */

                private String aqi;
                private String pm10;
                private String pm25;
                private String qlty;

                public String getAqi()
                {
                    return aqi;
                }

                public void setAqi(String aqi)
                {
                    this.aqi = aqi;
                }

                public String getPm10()
                {
                    return pm10;
                }

                public void setPm10(String pm10)
                {
                    this.pm10 = pm10;
                }

                public String getPm25()
                {
                    return pm25;
                }

                public void setPm25(String pm25)
                {
                    this.pm25 = pm25;
                }

                public String getQlty()
                {
                    return qlty;
                }

                public void setQlty(String qlty)
                {
                    this.qlty = qlty;
                }
            }
        }

        public static class BasicBean
        {
            /**
             * city : 海淀
             * cnty : 中国
             * id : CN101010200
             * lat : 39.590000
             * lon : 116.170000
             * update : {"loc":"2017-03-07 18:51","utc":"2017-03-07 10:51"}
             */

            private String city;
            private String cnty;
            private String id;
            private String lat;
            private String lon;
            private UpdateBean update;

            public String getCity()
            {
                return city;
            }

            public void setCity(String city)
            {
                this.city = city;
            }

            public String getCnty()
            {
                return cnty;
            }

            public void setCnty(String cnty)
            {
                this.cnty = cnty;
            }

            public String getId()
            {
                return id;
            }

            public void setId(String id)
            {
                this.id = id;
            }

            public String getLat()
            {
                return lat;
            }

            public void setLat(String lat)
            {
                this.lat = lat;
            }

            public String getLon()
            {
                return lon;
            }

            public void setLon(String lon)
            {
                this.lon = lon;
            }

            public UpdateBean getUpdate()
            {
                return update;
            }

            public void setUpdate(UpdateBean update)
            {
                this.update = update;
            }

            public static class UpdateBean
            {
                /**
                 * loc : 2017-03-07 18:51
                 * utc : 2017-03-07 10:51
                 */

                private String loc;
                private String utc;

                public String getLoc()
                {
                    return loc;
                }

                public void setLoc(String loc)
                {
                    this.loc = loc;
                }

                public String getUtc()
                {
                    return utc;
                }

                public void setUtc(String utc)
                {
                    this.utc = utc;
                }
            }
        }

        public static class NowBean
        {
            /**
             * cond : {"code":"100","txt":"晴"}
             * fl : 1
             * hum : 19
             * pcpn : 0
             * pres : 1022
             * tmp : 6
             * vis : 10
             * wind : {"deg":"320","dir":"北风","sc":"5-6","spd":"33"}
             */

            private CondBean cond;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private WindBean wind;

            public CondBean getCond()
            {
                return cond;
            }

            public void setCond(CondBean cond)
            {
                this.cond = cond;
            }

            public String getFl()
            {
                return fl;
            }

            public void setFl(String fl)
            {
                this.fl = fl;
            }

            public String getHum()
            {
                return hum;
            }

            public void setHum(String hum)
            {
                this.hum = hum;
            }

            public String getPcpn()
            {
                return pcpn;
            }

            public void setPcpn(String pcpn)
            {
                this.pcpn = pcpn;
            }

            public String getPres()
            {
                return pres;
            }

            public void setPres(String pres)
            {
                this.pres = pres;
            }

            public String getTmp()
            {
                return tmp;
            }

            public void setTmp(String tmp)
            {
                this.tmp = tmp;
            }

            public String getVis()
            {
                return vis;
            }

            public void setVis(String vis)
            {
                this.vis = vis;
            }

            public WindBean getWind()
            {
                return wind;
            }

            public void setWind(WindBean wind)
            {
                this.wind = wind;
            }

            public static class CondBean
            {
                /**
                 * code : 100
                 * txt : 晴
                 */

                private String code;
                private String txt;

                public String getCode()
                {
                    return code;
                }

                public void setCode(String code)
                {
                    this.code = code;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }

            public static class WindBean
            {
                /**
                 * deg : 320
                 * dir : 北风
                 * sc : 5-6
                 * spd : 33
                 */

                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg()
                {
                    return deg;
                }

                public void setDeg(String deg)
                {
                    this.deg = deg;
                }

                public String getDir()
                {
                    return dir;
                }

                public void setDir(String dir)
                {
                    this.dir = dir;
                }

                public String getSc()
                {
                    return sc;
                }

                public void setSc(String sc)
                {
                    this.sc = sc;
                }

                public String getSpd()
                {
                    return spd;
                }

                public void setSpd(String spd)
                {
                    this.spd = spd;
                }
            }
        }

        public static class SuggestionBean
        {
            /**
             * air : {"brf":"很差","txt":"气象条件不利于空气污染物稀释、扩散和清除，请尽量避免在室外长时间活动。"}
             * comf : {"brf":"较舒适","txt":"白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。"}
             * cw : {"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"}
             * drsg : {"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"}
             * flu : {"brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"}
             * sport : {"brf":"较适宜","txt":"天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意避风保暖。"}
             * trav : {"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"}
             * uv : {"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}
             */

            private AirBean air;
            private ComfBean comf;
            private CwBean cw;
            private DrsgBean drsg;
            private FluBean flu;
            private SportBean sport;
            private TravBean trav;
            private UvBean uv;

            public AirBean getAir()
            {
                return air;
            }

            public void setAir(AirBean air)
            {
                this.air = air;
            }

            public ComfBean getComf()
            {
                return comf;
            }

            public void setComf(ComfBean comf)
            {
                this.comf = comf;
            }

            public CwBean getCw()
            {
                return cw;
            }

            public void setCw(CwBean cw)
            {
                this.cw = cw;
            }

            public DrsgBean getDrsg()
            {
                return drsg;
            }

            public void setDrsg(DrsgBean drsg)
            {
                this.drsg = drsg;
            }

            public FluBean getFlu()
            {
                return flu;
            }

            public void setFlu(FluBean flu)
            {
                this.flu = flu;
            }

            public SportBean getSport()
            {
                return sport;
            }

            public void setSport(SportBean sport)
            {
                this.sport = sport;
            }

            public TravBean getTrav()
            {
                return trav;
            }

            public void setTrav(TravBean trav)
            {
                this.trav = trav;
            }

            public UvBean getUv()
            {
                return uv;
            }

            public void setUv(UvBean uv)
            {
                this.uv = uv;
            }

            public static class AirBean
            {
                /**
                 * brf : 很差
                 * txt : 气象条件不利于空气污染物稀释、扩散和清除，请尽量避免在室外长时间活动。
                 */

                private String brf;
                private String txt;

                public String getBrf()
                {
                    return brf;
                }

                public void setBrf(String brf)
                {
                    this.brf = brf;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }

            public static class ComfBean
            {
                /**
                 * brf : 较舒适
                 * txt : 白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。
                 */

                private String brf;
                private String txt;

                public String getBrf()
                {
                    return brf;
                }

                public void setBrf(String brf)
                {
                    this.brf = brf;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }

            public static class CwBean
            {
                /**
                 * brf : 较适宜
                 * txt : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
                 */

                private String brf;
                private String txt;

                public String getBrf()
                {
                    return brf;
                }

                public void setBrf(String brf)
                {
                    this.brf = brf;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }

            public static class DrsgBean
            {
                /**
                 * brf : 较冷
                 * txt : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
                 */

                private String brf;
                private String txt;

                public String getBrf()
                {
                    return brf;
                }

                public void setBrf(String brf)
                {
                    this.brf = brf;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }

            public static class FluBean
            {
                /**
                 * brf : 易发
                 * txt : 昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。
                 */

                private String brf;
                private String txt;

                public String getBrf()
                {
                    return brf;
                }

                public void setBrf(String brf)
                {
                    this.brf = brf;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }

            public static class SportBean
            {
                /**
                 * brf : 较适宜
                 * txt : 天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意避风保暖。
                 */

                private String brf;
                private String txt;

                public String getBrf()
                {
                    return brf;
                }

                public void setBrf(String brf)
                {
                    this.brf = brf;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }

            public static class TravBean
            {
                /**
                 * brf : 适宜
                 * txt : 天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。
                 */

                private String brf;
                private String txt;

                public String getBrf()
                {
                    return brf;
                }

                public void setBrf(String brf)
                {
                    this.brf = brf;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }

            public static class UvBean
            {
                /**
                 * brf : 中等
                 * txt : 属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。
                 */

                private String brf;
                private String txt;

                public String getBrf()
                {
                    return brf;
                }

                public void setBrf(String brf)
                {
                    this.brf = brf;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }
        }

        public static class DailyForecastBean
        {
            /**
             * astro : {"mr":"12:48","ms":"02:35","sr":"06:38","ss":"18:13"}
             * cond : {"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"}
             * date : 2017-03-07
             * hum : 22
             * pcpn : 0.0
             * pop : 0
             * pres : 1025
             * tmp : {"max":"10","min":"0"}
             * uv : 3
             * vis : 10
             * wind : {"deg":"204","dir":"北风","sc":"微风","spd":"10"}
             */

            private AstroBean astro;
            private CondBeanX cond;
            private String date;
            private String hum;
            private String pcpn;
            private String pop;
            private String pres;
            private TmpBean tmp;
            private String uv;
            private String vis;
            private WindBeanX wind;

            public AstroBean getAstro()
            {
                return astro;
            }

            public void setAstro(AstroBean astro)
            {
                this.astro = astro;
            }

            public CondBeanX getCond()
            {
                return cond;
            }

            public void setCond(CondBeanX cond)
            {
                this.cond = cond;
            }

            public String getDate()
            {
                return date;
            }

            public void setDate(String date)
            {
                this.date = date;
            }

            public String getHum()
            {
                return hum;
            }

            public void setHum(String hum)
            {
                this.hum = hum;
            }

            public String getPcpn()
            {
                return pcpn;
            }

            public void setPcpn(String pcpn)
            {
                this.pcpn = pcpn;
            }

            public String getPop()
            {
                return pop;
            }

            public void setPop(String pop)
            {
                this.pop = pop;
            }

            public String getPres()
            {
                return pres;
            }

            public void setPres(String pres)
            {
                this.pres = pres;
            }

            public TmpBean getTmp()
            {
                return tmp;
            }

            public void setTmp(TmpBean tmp)
            {
                this.tmp = tmp;
            }

            public String getUv()
            {
                return uv;
            }

            public void setUv(String uv)
            {
                this.uv = uv;
            }

            public String getVis()
            {
                return vis;
            }

            public void setVis(String vis)
            {
                this.vis = vis;
            }

            public WindBeanX getWind()
            {
                return wind;
            }

            public void setWind(WindBeanX wind)
            {
                this.wind = wind;
            }

            public static class AstroBean
            {
                /**
                 * mr : 12:48
                 * ms : 02:35
                 * sr : 06:38
                 * ss : 18:13
                 */

                private String mr;
                private String ms;
                private String sr;
                private String ss;

                public String getMr()
                {
                    return mr;
                }

                public void setMr(String mr)
                {
                    this.mr = mr;
                }

                public String getMs()
                {
                    return ms;
                }

                public void setMs(String ms)
                {
                    this.ms = ms;
                }

                public String getSr()
                {
                    return sr;
                }

                public void setSr(String sr)
                {
                    this.sr = sr;
                }

                public String getSs()
                {
                    return ss;
                }

                public void setSs(String ss)
                {
                    this.ss = ss;
                }
            }

            public static class CondBeanX
            {
                /**
                 * code_d : 100
                 * code_n : 100
                 * txt_d : 晴
                 * txt_n : 晴
                 */

                private String code_d;
                private String code_n;
                private String txt_d;
                private String txt_n;

                public String getCode_d()
                {
                    return code_d;
                }

                public void setCode_d(String code_d)
                {
                    this.code_d = code_d;
                }

                public String getCode_n()
                {
                    return code_n;
                }

                public void setCode_n(String code_n)
                {
                    this.code_n = code_n;
                }

                public String getTxt_d()
                {
                    return txt_d;
                }

                public void setTxt_d(String txt_d)
                {
                    this.txt_d = txt_d;
                }

                public String getTxt_n()
                {
                    return txt_n;
                }

                public void setTxt_n(String txt_n)
                {
                    this.txt_n = txt_n;
                }
            }

            public static class TmpBean
            {
                /**
                 * max : 10
                 * min : 0
                 */

                private String max;
                private String min;

                public String getMax()
                {
                    return max;
                }

                public void setMax(String max)
                {
                    this.max = max;
                }

                public String getMin()
                {
                    return min;
                }

                public void setMin(String min)
                {
                    this.min = min;
                }
            }

            public static class WindBeanX
            {
                /**
                 * deg : 204
                 * dir : 北风
                 * sc : 微风
                 * spd : 10
                 */

                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg()
                {
                    return deg;
                }

                public void setDeg(String deg)
                {
                    this.deg = deg;
                }

                public String getDir()
                {
                    return dir;
                }

                public void setDir(String dir)
                {
                    this.dir = dir;
                }

                public String getSc()
                {
                    return sc;
                }

                public void setSc(String sc)
                {
                    this.sc = sc;
                }

                public String getSpd()
                {
                    return spd;
                }

                public void setSpd(String spd)
                {
                    this.spd = spd;
                }
            }
        }

        public static class HourlyForecastBean
        {
            /**
             * cond : {"code":"100","txt":"晴"}
             * date : 2017-03-07 19:00
             * hum : 21
             * pop : 0
             * pres : 1023
             * tmp : 4
             * wind : {"deg":"326","dir":"西北风","sc":"3-4","spd":"21"}
             */

            private CondBeanXX cond;
            private String date;
            private String hum;
            private String pop;
            private String pres;
            private String tmp;
            private WindBeanXX wind;

            public CondBeanXX getCond()
            {
                return cond;
            }

            public void setCond(CondBeanXX cond)
            {
                this.cond = cond;
            }

            public String getDate()
            {
                return date;
            }

            public void setDate(String date)
            {
                this.date = date;
            }

            public String getHum()
            {
                return hum;
            }

            public void setHum(String hum)
            {
                this.hum = hum;
            }

            public String getPop()
            {
                return pop;
            }

            public void setPop(String pop)
            {
                this.pop = pop;
            }

            public String getPres()
            {
                return pres;
            }

            public void setPres(String pres)
            {
                this.pres = pres;
            }

            public String getTmp()
            {
                return tmp;
            }

            public void setTmp(String tmp)
            {
                this.tmp = tmp;
            }

            public WindBeanXX getWind()
            {
                return wind;
            }

            public void setWind(WindBeanXX wind)
            {
                this.wind = wind;
            }

            public static class CondBeanXX
            {
                /**
                 * code : 100
                 * txt : 晴
                 */

                private String code;
                private String txt;

                public String getCode()
                {
                    return code;
                }

                public void setCode(String code)
                {
                    this.code = code;
                }

                public String getTxt()
                {
                    return txt;
                }

                public void setTxt(String txt)
                {
                    this.txt = txt;
                }
            }

            public static class WindBeanXX
            {
                /**
                 * deg : 326
                 * dir : 西北风
                 * sc : 3-4
                 * spd : 21
                 */

                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg()
                {
                    return deg;
                }

                public void setDeg(String deg)
                {
                    this.deg = deg;
                }

                public String getDir()
                {
                    return dir;
                }

                public void setDir(String dir)
                {
                    this.dir = dir;
                }

                public String getSc()
                {
                    return sc;
                }

                public void setSc(String sc)
                {
                    this.sc = sc;
                }

                public String getSpd()
                {
                    return spd;
                }

                public void setSpd(String spd)
                {
                    this.spd = spd;
                }
            }
        }
    }
}
