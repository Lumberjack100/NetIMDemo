package com.mandala.netimdemo.activity;

import android.app.Application;

public class MyApplication extends Application
{
    private static MyApplication singleton;

    public static MyApplication newInstance()
    {
        return singleton;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();

        singleton = this;

    }

}
