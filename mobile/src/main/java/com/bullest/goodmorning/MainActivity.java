package com.bullest.goodmorning;

import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;

/**
 * Created by yunfezhang on 11/9/17.
 */

public class MainActivity extends AppCompatActivity{
    private AllViewModel mViewModel;
    private CardView mAqiCard;
    private CardView mWeatherCard;
    private CardView mTipCard;
    private ImageView mMaskIcon;
    private ImageView mUmbrellaIcon;
    private ImageView mConditionIcon;
    private Toolbar mToolbar;
    private FloatingActionButton mActionButton;
    private TextView tipView;
    private String tip;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configToolbar();

        TextView aqiText = findViewById(R.id.aqi_text);
        TextView tempText = findViewById(R.id.temp_view);
        TextView weekday = findViewById(R.id.weekday_view);
        TextView conditionText = findViewById(R.id.condition_view);
        mConditionIcon = findViewById(R.id.condition_icon);
        mUmbrellaIcon = findViewById(R.id.umbrella_icon);
        mMaskIcon = findViewById(R.id.mask_icon);
        mAqiCard = findViewById(R.id.card_aqi);
        mTipCard = findViewById(R.id.card_today_tip);
        mWeatherCard = findViewById(R.id.card_weather);
        mViewModel = new AllViewModel(this);
        tipView = findViewById(R.id.tip_textview);

        configTip();

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

                aqiText.setText(getString(R.string.aqi) + airQuality.getAqi());
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

        mViewModel.getTipLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                if (s.isEmpty()) {
                    mTipCard.setVisibility(View.GONE);
                } else {
                    tipView.setText("\uD83D\uDCA1  " + s);
                    mTipCard.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                break;
            case R.id.action_about:
                break;
        }
        return true;
    }

    private void configToolbar() {
        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getString(R.string.title));
        mToolbar.setTitleTextColor(getColor(R.color.colorAccent));
        setSupportActionBar(mToolbar);
    }

    private void configTip() {
        mActionButton = findViewById(R.id.fab);
        tipView = findViewById(R.id.tip_textview);
        mTipCard.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mViewModel.setTip("");
                Toast.makeText(MainActivity.this, "Delete the Tip", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        mActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MaterialDialog dialog = new MaterialDialog.Builder(MainActivity.this)
                        .onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                EditText editText = dialog.getView().findViewById(R.id.tip_edit_text);
                                mViewModel.setTip(editText.getText().toString());
                            }
                        })
                        .customView(R.layout.tip_dialog, true)
                        .theme(Theme.DARK)
                        .positiveText(R.string.add)
                        .negativeText(R.string.cancel).build();

                dialog.show();
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
