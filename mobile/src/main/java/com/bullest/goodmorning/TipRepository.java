package com.bullest.goodmorning;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by yunfezhang on 11/20/17.
 */

public class TipRepository {
    private static final Object syncLock = new Object();
    private static TipRepository instance;
    private SharedPreferences tipPerference;
    SharedPreferences.Editor editor;
    MutableLiveData<String> tip = new MutableLiveData<>();

    public TipRepository(Context context) {
        tipPerference = context.getSharedPreferences("TIP", 0);
    }

    public static TipRepository getInstance(Context context) {
        synchronized (syncLock) {
            if (instance == null) {
                instance = new TipRepository(context);
            }
        }
        return instance;
    }

    public LiveData<String> getTip() {
        tip.setValue(tipPerference.getString("TIP", ""));
        return tip;
    }

    public void deleteTip() {
        setTip("");
    }

    public void setTip(String tip) {
        this.tip.setValue(tip);
        editor = tipPerference.edit();
        editor.putString("TIP", tip);
        editor.apply();
    }
}
