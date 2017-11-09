package com.bullest.goodmorning;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yunfezhang on 11/9/17.
 */

public class AqiRepository {
    private static final String KEY = "5j1znBVAsnSf5xQyNQyq";
    private static final Object syncLock = new Object();
    private static AqiRepository instance;
    private Retrofit mRetrofit;
    private AqiService mAqiService;

    public AqiRepository() {
        Gson mGson = new GsonBuilder()
                .registerTypeAdapter(AirQuality.class, new AirQualityAdapter())
                .create();
        mRetrofit = new Retrofit.Builder()
                .baseUrl("http://www.pm25.in/")
                .addConverterFactory(GsonConverterFactory.create(mGson))
                .build();
        mAqiService = mRetrofit.create(AqiService.class);
    }

    public static AqiRepository getInstance() {
        synchronized (syncLock) {
            if (instance == null) {
                instance = new AqiRepository();
            }
        }
        return instance;
    }

    public LiveData<AirQuality> getAirQuality(String stationCode) {

        final MutableLiveData<AirQuality> data = new MutableLiveData<>();
        mAqiService.getAirQuality(stationCode, KEY).enqueue(new Callback<List<AirQuality>>() {
            @Override
            public void onResponse(Call<List<AirQuality>> call, Response<List<AirQuality>> response) {
                AirQuality airQuality = response.body().get(0);
                data.setValue(airQuality);
                Log.d("AQI", "Get AQI " + response.toString());
            }

            @Override
            public void onFailure(Call<List<AirQuality>> call, Throwable t) {
                Log.d("AQI", "Fail to get AQI");
            }
        });
        return data;
    }

    private class AirQualityAdapter extends TypeAdapter<AirQuality> {

        @Override
        public void write(JsonWriter out, AirQuality value) throws IOException {

        }

        @Override
        public AirQuality read(JsonReader in) throws IOException {
            AirQuality airQuality = new AirQuality();
            in.beginObject();
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "aqi":
                        airQuality.setAqi(in.nextInt());
                        break;
                    case "quality":
                        airQuality.setQuality(in.nextString());
                        break;
                    default:
                        in.skipValue();
                }
            }
            in.endObject();
            return airQuality;
        }
    }
}
