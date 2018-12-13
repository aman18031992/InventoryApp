package com.aman.inventoryapp;

import android.app.Application;
import com.facebook.stetho.Stetho;

/**
 * Created by aman on 2018-08-15.
 */
public class MyApplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
