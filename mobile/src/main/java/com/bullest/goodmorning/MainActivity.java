package com.bullest.goodmorning;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

/**
 * Created by yunfezhang on 11/9/17.
 */

public class MainActivity extends AppCompatActivity{
    private AllViewModel mViewModel;
    private CardView mAqiCard;
    private CardView mWeatherCard;
    private ImageView mMaskIcon;
    private ImageView mUmbrellaIcon;
    private ImageView mConditionIcon;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getString(R.string.title));
        mToolbar.setTitleTextColor(getColor(R.color.colorBlue));
        setSupportActionBar(mToolbar);

        TextView aqiText = findViewById(R.id.aqi_text);
        TextView tempText = findViewById(R.id.temp_view);
        TextView weekday = findViewById(R.id.weekday_view);
        TextView conditionText = findViewById(R.id.condition_view);
        mConditionIcon = findViewById(R.id.condition_icon);
        mUmbrellaIcon = findViewById(R.id.umbrella_icon);
        mMaskIcon = findViewById(R.id.mask_icon);
        mAqiCard = findViewById(R.id.card_aqi);
        mWeatherCard = findViewById(R.id.card_weather);
        mViewModel = new AllViewModel();

        mViewModel.getAirQualityLiveData().observe(this, new Observer<AirQuality>() {
            @Override
            public void onChanged(@Nullable AirQuality airQuality) {
                switch (airQuality.getQuality()){
                    case "优":
                        mAqiCard.setCardBackgroundColor(getColor(R.color.color优));
                        mMaskIcon.setImageDrawable(getDrawable(R.drawable.ic_runner));
                        break;
                    case "良":
                        mAqiCard.setCardBackgroundColor(getColor(R.color.color良));
                        mMaskIcon.setImageDrawable(getDrawable(R.drawable.ic_runner));
                        break;
                    case "轻度污染":
                        mAqiCard.setCardBackgroundColor(getColor(R.color.color轻度污染));
                        mMaskIcon.setImageDrawable(getDrawable(R.drawable.ic_mask));
                        break;
                    case "中度污染":
                        mAqiCard.setCardBackgroundColor(getColor(R.color.color中度污染));
                        mMaskIcon.setImageDrawable(getDrawable(R.drawable.ic_mask));
                        break;
                    case "重度污染":
                        mAqiCard.setCardBackgroundColor(getColor(R.color.color重度污染));
                        mMaskIcon.setImageDrawable(getDrawable(R.drawable.ic_mask));
                        break;
                    case "严重污染":
                        mAqiCard.setCardBackgroundColor(getColor(R.color.color严重污染));
                        mMaskIcon.setImageDrawable(getDrawable(R.drawable.ic_gas_mask));
                        break;
                    default:
                        mAqiCard.setCardBackgroundColor(getColor(R.color.color优));
                }

                aqiText.setText("AQI: " + airQuality.getAqi());
                Log.d("AQI", "set AQI " + airQuality.getAqi());
            }
        });

        mViewModel.getForecastDayLiveData().observe(this, new Observer<ForecastDay>() {
            @Override
            public void onChanged(@Nullable ForecastDay forecastDay) {
                tempText.setText(forecastDay.getTempString());
                conditionText.setText(forecastDay.getConditions());
                weekday.setText(forecastDay.getWeekday());
                mWeatherCard.setCardBackgroundColor(getColor(forecastDay.getTempColor()));
                mConditionIcon.setImageDrawable(getDrawable(forecastDay.getIcon()));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mViewModel.getAirQualityLiveData();
        mViewModel.getForecastDayLiveData();
    }
}
