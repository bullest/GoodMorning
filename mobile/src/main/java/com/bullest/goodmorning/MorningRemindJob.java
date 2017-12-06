package com.bullest.goodmorning;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;

import com.evernote.android.job.DailyJob;
import com.evernote.android.job.Job;
import com.evernote.android.job.JobRequest;

import java.util.concurrent.TimeUnit;

import static android.support.v4.app.NotificationCompat.VISIBILITY_PUBLIC;

/**
 * Created by yunfezhang on 11/28/17.
 */

public class MorningRemindJob extends DailyJob {
    public static final String TAG = "job_morning_remind_tag";

    @NonNull
    @Override
    protected DailyJobResult onRunDailyJob(@NonNull Params params) {
        NotificationManager manager = (NotificationManager) getContext().getSystemService(Context.NOTIFICATION_SERVICE);
        WeatherRepository mWeatherRepository = WeatherRepository.getInstance(getContext());
        ForecastDay day = null;

        while (day == null) {
            day = mWeatherRepository.getForecast().getValue();
        }
//        String aqi = "Current AQI: " + AqiRepository.getInstance().getAirQuality("1150A").getValue().getAqi();
        Bitmap icon = BitmapFactory.decodeResource(getContext().getResources(), day.getIcon());
        Notification notification = new NotificationCompat.Builder(getContext())
                .setContentTitle(day.getConditions())
                .setContentText(day.getTempString())
                .setSmallIcon(day.getIcon())
                .setLargeIcon(icon)
                .setColor(day.getTempColor())
                .setStyle(new NotificationCompat.BigTextStyle().bigText("Big text"))
                .setVisibility(VISIBILITY_PUBLIC)
                .setSound(Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.arpeggio))
                .build();
        manager.notify(123, notification);
        return DailyJobResult.SUCCESS;
    }

    public static void scheduleJob(int hour, int minute) {
        Long startMs = TimeUnit.HOURS.toMillis(hour)+TimeUnit.MINUTES.toMillis(minute);
        DailyJob.schedule(new JobRequest.Builder(TAG), startMs, startMs + TimeUnit.MINUTES.toMillis(10));
    }
}
