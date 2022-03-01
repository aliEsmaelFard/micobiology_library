package com.example.drnabipor;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;

public class MyApp extends Application {
    Context context;
    static Typeface typeface;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        typeface = Typeface.createFromAsset(context.getAssets(), "font/IranNastaliq.ttf");
    }
}

