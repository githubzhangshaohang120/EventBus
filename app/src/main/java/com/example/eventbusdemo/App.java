package com.example.eventbusdemo;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class App extends Application {

    private static SharedPreferences sharedPreferences;
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        //shared();
    }

    private void shared() {
        sharedPreferences = context.getSharedPreferences("config.xml", Context.MODE_PRIVATE);
    }

    public static SharedPreferences getShared(){
        return sharedPreferences;
    }
}
