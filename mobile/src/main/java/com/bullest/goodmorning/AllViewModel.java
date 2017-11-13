package com.bullest.goodmorning;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by yunfezhang on 11/9/17.
 */

public class AllViewModel extends ViewModel {
    private LiveData<AirQuality> mAirQualityLiveData;
    private AqiRepository mAqiRepository;
    private LiveData<ForecastDay> mForecastDayLiveData;
    private WeatherRepository mWeatherRepository;

    public AllViewModel() {
        mAqiRepository = AqiRepository.getInstance();
        mWeatherRepository = WeatherRepository.getInstance();
        init();
    }

    public void init() {
        initAirQuality();
        initWeather();
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
}
