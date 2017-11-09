package com.bullest.goodmorning;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by yunfezhang on 11/9/17.
 */

public class AllViewModel extends ViewModel {
    private LiveData<AirQuality> mAirQualityLiveData;
    private AqiRepository mAqiRepository;

    public AllViewModel() {
        mAqiRepository = AqiRepository.getInstance();
        init();
    }

    public void init() {
        if (this.mAirQualityLiveData != null) {
            return;
        }
        mAirQualityLiveData = mAqiRepository.getAirQuality("1150A");
    }

    public LiveData<AirQuality> getAirQualityLiveData() {
        return mAqiRepository.getAirQuality("1150A");
    }
}
