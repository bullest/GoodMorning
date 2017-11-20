package com.bullest.goodmorning;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;

/**
 * Created by yunfezhang on 11/9/17.
 */

public class AllViewModel extends ViewModel {
    private LiveData<AirQuality> mAirQualityLiveData;
    private AqiRepository mAqiRepository;
    private LiveData<ForecastDay> mForecastDayLiveData;
    private LiveData<String> mTipLiveData;
    private WeatherRepository mWeatherRepository;
    private TipRepository mTipRepository;

    public AllViewModel(Context context) {
        mAqiRepository = AqiRepository.getInstance();
        mWeatherRepository = WeatherRepository.getInstance(context);
        mTipRepository = TipRepository.getInstance(context);
        init();
    }

    public void init() {
        initAirQuality();
        initWeather();
        initTip();
    }

    private void initTip() {
        if (this.mTipLiveData != null) {
            return;
        }
        mTipLiveData = mTipRepository.getTip();
    }

    public void initAirQuality() {
        if (this.mAirQualityLiveData != null) {
            return;
        }
        mAirQualityLiveData = mAqiRepository.getAirQuality("1150A");
    }

    public void initWeather() {
        if (this.mWeatherRepository != null) {
            return;
        }
        mForecastDayLiveData = mWeatherRepository.getForecast();
    }

    public LiveData<AirQuality> getAirQualityLiveData() {
        return mAqiRepository.getAirQuality("1150A");
    }

    public LiveData<ForecastDay> getForecastDayLiveData() {
        return mWeatherRepository.getForecast();
    }

    public LiveData<String> getTipLiveData() {
        return mTipRepository.getTip();
    }

    public void setTip(String tip) {
        mTipRepository.setTip(tip);
    }
}
