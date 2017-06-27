package com.example.vikrant.trackingdevice;

import android.app.Application;

/**
 * Created by vikrant on 15/6/17.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        System.setProperty("http.keepAliveDuration", String.valueOf(30 * 60 * 1000));
    }
}
