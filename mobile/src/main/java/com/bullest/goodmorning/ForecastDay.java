package com.bullest.goodmorning;

/**
 * Created by yunfezhang on 11/12/17.
 */

class ForecastDay {
    private String conditions;
    private int highTemp;
    private int lowTemp;
    private String weatherIcon;
    private String weekday;
    private Boolean IsToday;
    private String icon;

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public Boolean getToday() {
        return IsToday;
    }

    public void setToday(Boolean today) {
        IsToday = today;
    }

    public String getTempString() {
        return lowTemp + "℃~" + highTemp + "℃";
    }

    public int getTempColor() {
        if (highTemp >= 38){
            return R.color.colorTemp38;
        } else if (highTemp >=35 ){
            return R.color.colorTemp35;
        } else if (highTemp >=30) {
            return R.color.colorTemp30;
        } else if (lowTemp < 0) {
            return R.color.colorTemp0;
        } else if (lowTemp < 5) {
            return R.color.colorTemp5;
        } else if (lowTemp < 10) {
            return R.color.colorTemp10;
        } else if ((lowTemp + highTemp) > 20){
            return R.color.colorTempComfHigh;
        } else {
            return R.color.colorTempComfLow;
        }
    }

    public int getIcon() {
        if (icon.contains("cloudy")) {
            return R.drawable.ic_clouds;
        } else if (icon.contains("rain") || icon.contains("storms")) {
            return R.drawable.ic_raining;
        } else if (icon.contains("clear") || icon.contains("sunny")){
            return R.drawable.ic_sun;
        } else if (icon.contains("haze") || icon.contains("fog")){
            return R.drawable.ic_haze;
        } else if(icon.contains("flurries") || icon.contains("sleet") || icon.contains("snow")){
            return R.drawable.ic_snowing;
        } else {
            return R.drawable.ic_moon;
        }
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
