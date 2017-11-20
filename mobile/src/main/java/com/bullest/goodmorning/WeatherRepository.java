package com.bullest.goodmorning;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yunfezhang on 11/12/17.
 */

public class WeatherRepository {
    private static final String KEY = "242df9fd0f07e1b2";
    private static final String STATION = "zmw:00000.65.WZSPD.json";
    private static String language = "CN";
    private static final Object syncLock = new Object();
    private static WeatherRepository instance;
    private Retrofit mRetrofit;
    private WeatherService mWeatherService;

    public WeatherRepository() {
        Gson mGson = new GsonBuilder()
                .registerTypeAdapter(AirQuality.class, new WeatherRepository.ForecastDayAdapter())
                .create();
        mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.wunderground.com/")
                .build();
        mWeatherService = mRetrofit.create(WeatherService.class);
    }

    public static WeatherRepository getInstance(Context context) {
        synchronized (syncLock) {
            if (instance == null) {
                instance = new WeatherRepository();
            }
        }
        if (context.getResources().getConfiguration().locale.getDisplayLanguage().contains("中文")) {
            language = "CN";
        } else {
            language = "EN";
        }
        return instance;
    }

    public LiveData<ForecastDay> getForecast() {
        final MutableLiveData<ForecastDay> data = new MutableLiveData<>();

        mWeatherService.getForecast(KEY, language, STATION).enqueue(new Callback<ForcastBean>() {
            @Override
            public void onResponse(Call<ForcastBean> call, Response<ForcastBean> response) {
                ForecastDay forecastDay = new ForecastDay();
                List<ForcastBean.ForecastBean.SimpleforecastBean.ForecastdayBeanX> forcast = response.body().getForecast().getSimpleforecast().getForecastday();
                if (Calendar.getInstance().getTime().getHours() < 20) {
                    forecastDay.setWeekday(forcast.get(0).getDate().getWeekday_short());
                    forecastDay.setLowTemp(((int) forcast.get(0).getLow().getCelsius()));
                    forecastDay.setHighTemp(((int) forcast.get(0).getHigh().getCelsius()));
                    forecastDay.setConditions(forcast.get(0).getConditions());
                    forecastDay.setIcon(forcast.get(0).getIcon());
                    forecastDay.setToday(Boolean.TRUE);
                } else {
                    forecastDay.setWeekday(forcast.get(1).getDate().getWeekday_short());
                    forecastDay.setLowTemp(((int) forcast.get(1).getLow().getCelsius()));
                    forecastDay.setHighTemp(((int) forcast.get(1).getHigh().getCelsius()));
                    forecastDay.setConditions(forcast.get(1).getConditions());
                    forecastDay.setIcon(forcast.get(1).getIcon());
                    forecastDay.setToday(Boolean.FALSE);
                }
                Log.d("Weather", "get " + forecastDay.getWeekday()+ "\'s weather");
                data.setValue(forecastDay);
            }

            @Override
            public void onFailure(Call<ForcastBean> call, Throwable t) {
                Log.d("Weather", t.getMessage());
            }
        });
        return data;
    }

    private class ForecastDayAdapter extends TypeAdapter<ForecastDay>{
        @Override
        public void write(JsonWriter out, ForecastDay value) throws IOException {
        }

        @Override
        public ForecastDay read(JsonReader in) throws IOException {
            ForecastDay forecastDay = new ForecastDay();
            in.beginObject();
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "weekday_short":
                        forecastDay.setWeekday(in.nextString());
                        break;
                    case "high":
                        forecastDay.setHighTemp(in.nextInt());
                    case "low":
                        forecastDay.setLowTemp(in.nextInt());
                    default:
                        in.skipValue();
                }
            }
            in.endObject();
            return forecastDay;
        }
    }
}
