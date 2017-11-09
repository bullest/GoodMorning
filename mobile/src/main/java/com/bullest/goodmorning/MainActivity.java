package com.bullest.goodmorning;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by yunfezhang on 11/9/17.
 */

public class MainActivity extends AppCompatActivity{
    private AllViewModel mViewModel;
    private CardView mAqiCard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView aqiText = findViewById(R.id.aqi_text);
        mAqiCard = findViewById(R.id.card_aqi);
        mViewModel = new AllViewModel();

        mViewModel.getAirQualityLiveData().observe(this, new Observer<AirQuality>() {
            @Override
            public void onChanged(@Nullable AirQuality airQuality) {
                switch (airQuality.getQuality()){
                    case "优":
                        mAqiCard.setCardBackgroundColor(getColor(R.color.color优));
                        break;
                    case "严重污染":
                        mAqiCard.setCardBackgroundColor(getColor(R.color.color严重污染));
                        break;
                }

                aqiText.setText("" + airQuality.getAqi() + airQuality.getQuality());
                Log.d("AQI", "set AQI " + airQuality.getAqi());
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mViewModel.getAirQualityLiveData();
    }
}
