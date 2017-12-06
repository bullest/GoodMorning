package com.bullest.goodmorning;

import android.app.Application;

import com.evernote.android.job.JobManager;

/**
 * Created by yunfezhang on 11/28/17.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JobManager.create(this).addJobCreator(new MoriningJobCreator());
    }
}
