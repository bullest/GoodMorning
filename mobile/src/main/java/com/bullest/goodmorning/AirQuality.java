package com.bullest.goodmorning;

/**
 * Created by yunfezhang on 11/9/17.
 */

class AirQuality {
    public int mAqi;
    public String mQuality;

    public String getQuality() {
        return mQuality;
    }

    public void setQuality(String quality) {
        mQuality = quality;
    }

    public void setAqi(int aqi) {
        mAqi = aqi;
    }

    public int getAqi() {
        return mAqi;
    }
}
