package com.bullest.goodmorning;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yunfezhang on 11/9/17.
 */
// http://www.pm25.in/api/querys/aqis_by_station.json?station_code=1150A&token=5j1znBVAsnSf5xQyNQyq
public interface AqiService {
    @GET("api/querys/aqis_by_station.json")
    Call<List<AirQuality>> getAirQuality(@Query("station_code") String stationCode,
                                         @Query("token") String token);
}
