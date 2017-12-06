package com.bullest.goodmorning.dataBean;

import java.util.List;

/**
 * Created by yunfezhang on 11/16/17.
 */

public class ForcastBean {
    /**
     * response : {"version":"0.1","termsofService":"http://www.wunderground.com/weather/api/d/terms.html","features":{"forecast":1}}
     * forecast : {"txt_forecast":{"date":"3:21 PM CST","forecastday":[{"period":0,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Sunday","fcttext":"Partly cloudy. Lows overnight in the low 50s.","fcttext_metric":"Partly cloudy. Low 12C.","pop":"20"},{"period":1,"icon":"nt_partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif","title":"Sunday Night","fcttext":"A few clouds. Low 53F. Winds ESE at 5 to 10 mph.","fcttext_metric":"A few clouds. Low 12C. Winds ESE at 10 to 15 km/h.","pop":"20"},{"period":2,"icon":"mostlycloudy","icon_url":"http://icons.wxug.com/i/c/k/mostlycloudy.gif","title":"Monday","fcttext":"Mainly cloudy. High 68F. Winds E at 5 to 10 mph.","fcttext_metric":"Considerable cloudiness. High around 20C. Winds E at 10 to 15 km/h.","pop":"10"},{"period":3,"icon":"nt_chancerain","icon_url":"http://icons.wxug.com/i/c/k/nt_chancerain.gif","title":"Monday Night","fcttext":"Considerable cloudiness with occasional rain showers. Low 56F. Winds NNE at 5 to 10 mph. Chance of rain 60%.","fcttext_metric":"Overcast with rain showers at times. Low 13C. Winds NNE at 10 to 15 km/h. Chance of rain 60%.","pop":"60"},{"period":4,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Tuesday","fcttext":"Cloudy early with partial sunshine expected late. High 66F. Winds NNE at 10 to 15 mph.","fcttext_metric":"Cloudy skies early will become partly cloudy later in the day. High 19C. Winds NNE at 15 to 25 km/h.","pop":"20"},{"period":5,"icon":"nt_partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/nt_partlycloudy.gif","title":"Tuesday Night","fcttext":"Cloudy early with partial clearing expected late. Low 52F. Winds NNE at 5 to 10 mph.","fcttext_metric":"Cloudy skies early, then partly cloudy after midnight. Low 11C. Winds NNE at 10 to 15 km/h.","pop":"10"},{"period":6,"icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","title":"Wednesday","fcttext":"Partly cloudy. High 62F. Winds ENE at 10 to 15 mph.","fcttext_metric":"Intervals of clouds and sunshine. High 17C. Winds ENE at 15 to 25 km/h.","pop":"10"},{"period":7,"icon":"nt_rain","icon_url":"http://icons.wxug.com/i/c/k/nt_rain.gif","title":"Wednesday Night","fcttext":"Cloudy with occasional rain after midnight. Low 56F. Winds ESE at 10 to 15 mph. Chance of rain 90%.","fcttext_metric":"Cloudy with rain developing after midnight. Low 13C. Winds ESE at 15 to 25 km/h. Chance of rain 90%.","pop":"90"}]},"simpleforecast":{"forecastday":[{"date":{"epoch":"1510484400","pretty":"7:00 PM CST on November 12, 2017","day":12,"month":11,"year":2017,"yday":315,"hour":19,"min":"00","sec":0,"isdst":"0","monthname":"November","monthname_short":"Nov","weekday_short":"Sun","weekday":"Sunday","ampm":"PM","tz_short":"CST","tz_long":"Asia/Shanghai"},"period":1,"high":{"fahrenheit":"79","celsius":"26"},"low":{"fahrenheit":"53","celsius":"12"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":20,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":null,"mm":null},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":null,"cm":null},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":20,"kph":32,"dir":"","degrees":0},"avewind":{"mph":2,"kph":4,"dir":"WSW","degrees":242},"avehumidity":73,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1510570800","pretty":"7:00 PM CST on November 13, 2017","day":13,"month":11,"year":2017,"yday":316,"hour":19,"min":"00","sec":0,"isdst":"0","monthname":"November","monthname_short":"Nov","weekday_short":"Mon","weekday":"Monday","ampm":"PM","tz_short":"CST","tz_long":"Asia/Shanghai"},"period":2,"high":{"fahrenheit":"68","celsius":"20"},"low":{"fahrenheit":"56","celsius":"13"},"conditions":"Mostly Cloudy","icon":"mostlycloudy","icon_url":"http://icons.wxug.com/i/c/k/mostlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0.11,"mm":3},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0.11,"mm":3},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":10,"kph":16,"dir":"E","degrees":101},"avewind":{"mph":7,"kph":11,"dir":"E","degrees":101},"avehumidity":65,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1510657200","pretty":"7:00 PM CST on November 14, 2017","day":14,"month":11,"year":2017,"yday":317,"hour":19,"min":"00","sec":0,"isdst":"0","monthname":"November","monthname_short":"Nov","weekday_short":"Tue","weekday":"Tuesday","ampm":"PM","tz_short":"CST","tz_long":"Asia/Shanghai"},"period":3,"high":{"fahrenheit":"66","celsius":"19"},"low":{"fahrenheit":"52","celsius":"11"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":20,"qpf_allday":{"in":0,"mm":0},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0,"mm":0},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":15,"kph":24,"dir":"NNE","degrees":24},"avewind":{"mph":12,"kph":19,"dir":"NNE","degrees":24},"avehumidity":68,"maxhumidity":0,"minhumidity":0},{"date":{"epoch":"1510743600","pretty":"7:00 PM CST on November 15, 2017","day":15,"month":11,"year":2017,"yday":318,"hour":19,"min":"00","sec":0,"isdst":"0","monthname":"November","monthname_short":"Nov","weekday_short":"Wed","weekday":"Wednesday","ampm":"PM","tz_short":"CST","tz_long":"Asia/Shanghai"},"period":4,"high":{"fahrenheit":"62","celsius":"17"},"low":{"fahrenheit":"56","celsius":"13"},"conditions":"Partly Cloudy","icon":"partlycloudy","icon_url":"http://icons.wxug.com/i/c/k/partlycloudy.gif","skyicon":"","pop":10,"qpf_allday":{"in":0.15,"mm":4},"qpf_day":{"in":0,"mm":0},"qpf_night":{"in":0.15,"mm":4},"snow_allday":{"in":0,"cm":0},"snow_day":{"in":0,"cm":0},"snow_night":{"in":0,"cm":0},"maxwind":{"mph":15,"kph":24,"dir":"ENE","degrees":62},"avewind":{"mph":11,"kph":18,"dir":"ENE","degrees":62},"avehumidity":58,"maxhumidity":0,"minhumidity":0}]}}
     */

    private ResponseBean response;
    private ForecastBean forecast;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public ForecastBean getForecast() {
        return forecast;
    }

    public void setForecast(ForecastBean forecast) {
        this.forecast = forecast;
    }

    public static class ResponseBean {
        /**
         * version : 0.1
         * termsofService : http://www.wunderground.com/weather/api/d/terms.html
         * features : {"forecast":1}
         */

        private String version;
        private String termsofService;
        private FeaturesBean features;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getTermsofService() {
            return termsofService;
        }

        public void setTermsofService(String termsofService) {
            this.termsofService = termsofService;
        }

        public FeaturesBean getFeatures() {
            return features;
        }

        public void setFeatures(FeaturesBean features) {
            this.features = features;
        }

        public static class FeaturesBean {
            /**
             * forecast : 1
             */

            private double forecast;

            public double getForecast() {
                return forecast;
            }

            public void setForecast(double forecast) {
                this.forecast = forecast;
            }
        }
    }

    public static class ForecastBean {

        private TxtForecastBean txt_forecast;
        private SimpleforecastBean simpleforecast;

        public TxtForecastBean getTxt_forecast() {
            return txt_forecast;
        }

        public void setTxt_forecast(TxtForecastBean txt_forecast) {
            this.txt_forecast = txt_forecast;
        }

        public SimpleforecastBean getSimpleforecast() {
            return simpleforecast;
        }

        public void setSimpleforecast(SimpleforecastBean simpleforecast) {
            this.simpleforecast = simpleforecast;
        }

        public static class TxtForecastBean {

            private String date;
            private List<ForecastdayBean> forecastday;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public List<ForecastdayBean> getForecastday() {
                return forecastday;
            }

            public void setForecastday(List<ForecastdayBean> forecastday) {
                this.forecastday = forecastday;
            }

            public static class ForecastdayBean {
                /**
                 * period : 0
                 * icon : partlycloudy
                 * icon_url : http://icons.wxug.com/i/c/k/partlycloudy.gif
                 * title : Sunday
                 * fcttext : Partly cloudy. Lows overnight in the low 50s.
                 * fcttext_metric : Partly cloudy. Low 12C.
                 * pop : 20
                 */

                private double period;
                private String icon;
                private String icon_url;
                private String title;
                private String fcttext;
                private String fcttext_metric;
                private String pop;

                public double getPeriod() {
                    return period;
                }

                public void setPeriod(double period) {
                    this.period = period;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getIcon_url() {
                    return icon_url;
                }

                public void setIcon_url(String icon_url) {
                    this.icon_url = icon_url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getFcttext() {
                    return fcttext;
                }

                public void setFcttext(String fcttext) {
                    this.fcttext = fcttext;
                }

                public String getFcttext_metric() {
                    return fcttext_metric;
                }

                public void setFcttext_metric(String fcttext_metric) {
                    this.fcttext_metric = fcttext_metric;
                }

                public String getPop() {
                    return pop;
                }

                public void setPop(String pop) {
                    this.pop = pop;
                }
            }
        }

        public static class SimpleforecastBean {
            private List<ForecastdayBeanX> forecastday;

            public List<ForecastdayBeanX> getForecastday() {
                return forecastday;
            }

            public void setForecastday(List<ForecastdayBeanX> forecastday) {
                this.forecastday = forecastday;
            }

            public static class ForecastdayBeanX {
                /**
                 * date : {"epoch":"1510484400","pretty":"7:00 PM CST on November 12, 2017","day":12,"month":11,"year":2017,"yday":315,"hour":19,"min":"00","sec":0,"isdst":"0","monthname":"November","monthname_short":"Nov","weekday_short":"Sun","weekday":"Sunday","ampm":"PM","tz_short":"CST","tz_long":"Asia/Shanghai"}
                 * period : 1
                 * high : {"fahrenheit":"79","celsius":"26"}
                 * low : {"fahrenheit":"53","celsius":"12"}
                 * conditions : Partly Cloudy
                 * icon : partlycloudy
                 * icon_url : http://icons.wxug.com/i/c/k/partlycloudy.gif
                 * skyicon :
                 * pop : 20
                 * qpf_allday : {"in":0,"mm":0}
                 * qpf_day : {"in":null,"mm":null}
                 * qpf_night : {"in":0,"mm":0}
                 * snow_allday : {"in":0,"cm":0}
                 * snow_day : {"in":null,"cm":null}
                 * snow_night : {"in":0,"cm":0}
                 * maxwind : {"mph":20,"kph":32,"dir":"","degrees":0}
                 * avewind : {"mph":2,"kph":4,"dir":"WSW","degrees":242}
                 * avehumidity : 73
                 * maxhumidity : 0
                 * minhumidity : 0
                 */

                private DateBean date;
                private double period;
                private HighBean high;
                private LowBean low;
                private String conditions;
                private String icon;
                private String icon_url;
                private String skyicon;
                private double pop;
                private QpfAlldayBean qpf_allday;
                private QpfDayBean qpf_day;
                private QpfNightBean qpf_night;
                private SnowAlldayBean snow_allday;
                private SnowDayBean snow_day;
                private SnowNightBean snow_night;
                private MaxwindBean maxwind;
                private AvewindBean avewind;
                private double avehumidity;
                private double maxhumidity;
                private double minhumidity;

                public DateBean getDate() {
                    return date;
                }

                public void setDate(DateBean date) {
                    this.date = date;
                }

                public double getPeriod() {
                    return period;
                }

                public void setPeriod(double period) {
                    this.period = period;
                }

                public HighBean getHigh() {
                    return high;
                }

                public void setHigh(HighBean high) {
                    this.high = high;
                }

                public LowBean getLow() {
                    return low;
                }

                public void setLow(LowBean low) {
                    this.low = low;
                }

                public String getConditions() {
                    return conditions;
                }

                public void setConditions(String conditions) {
                    this.conditions = conditions;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getIcon_url() {
                    return icon_url;
                }

                public void setIcon_url(String icon_url) {
                    this.icon_url = icon_url;
                }

                public String getSkyicon() {
                    return skyicon;
                }

                public void setSkyicon(String skyicon) {
                    this.skyicon = skyicon;
                }

                public double getPop() {
                    return pop;
                }

                public void setPop(double pop) {
                    this.pop = pop;
                }

                public QpfAlldayBean getQpf_allday() {
                    return qpf_allday;
                }

                public void setQpf_allday(QpfAlldayBean qpf_allday) {
                    this.qpf_allday = qpf_allday;
                }

                public QpfDayBean getQpf_day() {
                    return qpf_day;
                }

                public void setQpf_day(QpfDayBean qpf_day) {
                    this.qpf_day = qpf_day;
                }

                public QpfNightBean getQpf_night() {
                    return qpf_night;
                }

                public void setQpf_night(QpfNightBean qpf_night) {
                    this.qpf_night = qpf_night;
                }

                public SnowAlldayBean getSnow_allday() {
                    return snow_allday;
                }

                public void setSnow_allday(SnowAlldayBean snow_allday) {
                    this.snow_allday = snow_allday;
                }

                public SnowDayBean getSnow_day() {
                    return snow_day;
                }

                public void setSnow_day(SnowDayBean snow_day) {
                    this.snow_day = snow_day;
                }

                public SnowNightBean getSnow_night() {
                    return snow_night;
                }

                public void setSnow_night(SnowNightBean snow_night) {
                    this.snow_night = snow_night;
                }

                public MaxwindBean getMaxwind() {
                    return maxwind;
                }

                public void setMaxwind(MaxwindBean maxwind) {
                    this.maxwind = maxwind;
                }

                public AvewindBean getAvewind() {
                    return avewind;
                }

                public void setAvewind(AvewindBean avewind) {
                    this.avewind = avewind;
                }

                public double getAvehumidity() {
                    return avehumidity;
                }

                public void setAvehumidity(double avehumidity) {
                    this.avehumidity = avehumidity;
                }

                public double getMaxhumidity() {
                    return maxhumidity;
                }

                public void setMaxhumidity(double maxhumidity) {
                    this.maxhumidity = maxhumidity;
                }

                public double getMinhumidity() {
                    return minhumidity;
                }

                public void setMinhumidity(double minhumidity) {
                    this.minhumidity = minhumidity;
                }

                public static class DateBean {
                    /**
                     * epoch : 1510484400
                     * pretty : 7:00 PM CST on November 12, 2017
                     * day : 12
                     * month : 11
                     * year : 2017
                     * yday : 315
                     * hour : 19
                     * min : 00
                     * sec : 0
                     * isdst : 0
                     * monthname : November
                     * monthname_short : Nov
                     * weekday_short : Sun
                     * weekday : Sunday
                     * ampm : PM
                     * tz_short : CST
                     * tz_long : Asia/Shanghai
                     */

                    private String epoch;
                    private String pretty;
                    private double day;
                    private double month;
                    private double year;
                    private double yday;
                    private double hour;
                    private String min;
                    private double sec;
                    private String isdst;
                    private String monthname;
                    private String monthname_short;
                    private String weekday_short;
                    private String weekday;
                    private String ampm;
                    private String tz_short;
                    private String tz_long;

                    public String getEpoch() {
                        return epoch;
                    }

                    public void setEpoch(String epoch) {
                        this.epoch = epoch;
                    }

                    public String getPretty() {
                        return pretty;
                    }

                    public void setPretty(String pretty) {
                        this.pretty = pretty;
                    }

                    public double getDay() {
                        return day;
                    }

                    public void setDay(double day) {
                        this.day = day;
                    }

                    public double getMonth() {
                        return month;
                    }

                    public void setMonth(double month) {
                        this.month = month;
                    }

                    public double getYear() {
                        return year;
                    }

                    public void setYear(double year) {
                        this.year = year;
                    }

                    public double getYday() {
                        return yday;
                    }

                    public void setYday(double yday) {
                        this.yday = yday;
                    }

                    public double getHour() {
                        return hour;
                    }

                    public void setHour(double hour) {
                        this.hour = hour;
                    }

                    public String getMin() {
                        return min;
                    }

                    public void setMin(String min) {
                        this.min = min;
                    }

                    public double getSec() {
                        return sec;
                    }

                    public void setSec(double sec) {
                        this.sec = sec;
                    }

                    public String getIsdst() {
                        return isdst;
                    }

                    public void setIsdst(String isdst) {
                        this.isdst = isdst;
                    }

                    public String getMonthname() {
                        return monthname;
                    }

                    public void setMonthname(String monthname) {
                        this.monthname = monthname;
                    }

                    public String getMonthname_short() {
                        return monthname_short;
                    }

                    public void setMonthname_short(String monthname_short) {
                        this.monthname_short = monthname_short;
                    }

                    public String getWeekday_short() {
                        return weekday_short;
                    }

                    public void setWeekday_short(String weekday_short) {
                        this.weekday_short = weekday_short;
                    }

                    public String getWeekday() {
                        return weekday;
                    }

                    public void setWeekday(String weekday) {
                        this.weekday = weekday;
                    }

                    public String getAmpm() {
                        return ampm;
                    }

                    public void setAmpm(String ampm) {
                        this.ampm = ampm;
                    }

                    public String getTz_short() {
                        return tz_short;
                    }

                    public void setTz_short(String tz_short) {
                        this.tz_short = tz_short;
                    }

                    public String getTz_long() {
                        return tz_long;
                    }

                    public void setTz_long(String tz_long) {
                        this.tz_long = tz_long;
                    }
                }

                public static class HighBean {
                    /**
                     * fahrenheit : 79
                     * celsius : 26
                     */

                    private double fahrenheit;
                    private double celsius;

                    public double getFahrenheit() {
                        return fahrenheit;
                    }

                    public void setFahrenheit(double fahrenheit) {
                        this.fahrenheit = fahrenheit;
                    }

                    public double getCelsius() {
                        return celsius;
                    }

                    public void setCelsius(double celsius) {
                        this.celsius = celsius;
                    }
                }

                public static class LowBean {
                    /**
                     * fahrenheit : 53
                     * celsius : 12
                     */

                    private double fahrenheit;
                    private double celsius;

                    public double getFahrenheit() {
                        return fahrenheit;
                    }

                    public void setFahrenheit(double fahrenheit) {
                        this.fahrenheit = fahrenheit;
                    }

                    public double getCelsius() {
                        return celsius;
                    }

                    public void setCelsius(double celsius) {
                        this.celsius = celsius;
                    }
                }

                public static class QpfAlldayBean {
                    /**
                     * in : 0
                     * mm : 0
                     */

                    private double in;
                    private double mm;

                    public double getIn() {
                        return in;
                    }

                    public void setIn(double in) {
                        this.in = in;
                    }

                    public double getMm() {
                        return mm;
                    }

                    public void setMm(double mm) {
                        this.mm = mm;
                    }
                }

                public static class QpfDayBean {
                    /**
                     * in : null
                     * mm : null
                     */

                    private Object in;
                    private Object mm;

                    public Object getIn() {
                        return in;
                    }

                    public void setIn(Object in) {
                        this.in = in;
                    }

                    public Object getMm() {
                        return mm;
                    }

                    public void setMm(Object mm) {
                        this.mm = mm;
                    }
                }

                public static class QpfNightBean {
                    /**
                     * in : 0
                     * mm : 0
                     */

                    private double in;
                    private double mm;

                    public double getIn() {
                        return in;
                    }

                    public void setIn(double in) {
                        this.in = in;
                    }

                    public double getMm() {
                        return mm;
                    }

                    public void setMm(double mm) {
                        this.mm = mm;
                    }
                }

                public static class SnowAlldayBean {
                    /**
                     * in : 0
                     * cm : 0
                     */

                    private double in;
                    private double cm;

                    public double getIn() {
                        return in;
                    }

                    public void setIn(double in) {
                        this.in = in;
                    }

                    public double getCm() {
                        return cm;
                    }

                    public void setCm(double cm) {
                        this.cm = cm;
                    }
                }

                public static class SnowDayBean {
                    /**
                     * in : null
                     * cm : null
                     */

                    private Object in;
                    private Object cm;

                    public Object getIn() {
                        return in;
                    }

                    public void setIn(Object in) {
                        this.in = in;
                    }

                    public Object getCm() {
                        return cm;
                    }

                    public void setCm(Object cm) {
                        this.cm = cm;
                    }
                }

                public static class SnowNightBean {
                    /**
                     * in : 0
                     * cm : 0
                     */

                    private double in;
                    private double cm;

                    public double getIn() {
                        return in;
                    }

                    public void setIn(double in) {
                        this.in = in;
                    }

                    public double getCm() {
                        return cm;
                    }

                    public void setCm(double cm) {
                        this.cm = cm;
                    }
                }

                public static class MaxwindBean {
                    /**
                     * mph : 20
                     * kph : 32
                     * dir :
                     * degrees : 0
                     */

                    private double mph;
                    private double kph;
                    private String dir;
                    private double degrees;

                    public double getMph() {
                        return mph;
                    }

                    public void setMph(double mph) {
                        this.mph = mph;
                    }

                    public double getKph() {
                        return kph;
                    }

                    public void setKph(double kph) {
                        this.kph = kph;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }

                    public double getDegrees() {
                        return degrees;
                    }

                    public void setDegrees(double degrees) {
                        this.degrees = degrees;
                    }
                }

                public static class AvewindBean {
                    /**
                     * mph : 2
                     * kph : 4
                     * dir : WSW
                     * degrees : 242
                     */

                    private double mph;
                    private double kph;
                    private String dir;
                    private double degrees;

                    public double getMph() {
                        return mph;
                    }

                    public void setMph(double mph) {
                        this.mph = mph;
                    }

                    public double getKph() {
                        return kph;
                    }

                    public void setKph(double kph) {
                        this.kph = kph;
                    }

                    public String getDir() {
                        return dir;
                    }

                    public void setDir(String dir) {
                        this.dir = dir;
                    }

                    public double getDegrees() {
                        return degrees;
                    }

                    public void setDegrees(double degrees) {
                        this.degrees = degrees;
                    }
                }
            }
        }
    }
}
