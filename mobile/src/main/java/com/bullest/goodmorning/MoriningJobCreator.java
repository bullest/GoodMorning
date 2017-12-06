package com.bullest.goodmorning;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

/**
 * Created by yunfezhang on 11/28/17.
 */

class MoriningJobCreator implements JobCreator {
    @Nullable
    @Override
    public Job create(@NonNull String tag) {
        switch (tag) {
            case MorningRemindJob.TAG:
                return new MorningRemindJob();
            default:
                return null;
        }
    }
}
