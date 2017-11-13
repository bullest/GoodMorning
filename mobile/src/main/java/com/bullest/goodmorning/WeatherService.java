package com.bullest.goodmorning;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by yunfezhang on 11/12/17.
 */

public interface WeatherService {

//    http://api.wunderground.com/api/242df9fd0f07e1b2/hourly/q/zmw:00000.65.WZSPD.json

    @GET("api/{key}/hourly/lang:{language}/q/{station}")
    Call<List<HourlyWeather>> getHourlyWeather(@Path("key") String key,
                                               @Path("language") String language,
                                               @Path("station") String station);

    @GET("api/{key}/forecast/lang:{language}/q/{station}")
    Call<ForcastBean> getForecast(@Path("key") String key,
                                  @Path("language") String language,
                                  @Path("station") String station);
}
