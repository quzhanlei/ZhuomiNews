package com.jonemill.www.zhuominews;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by QZL on 16/7/19.
 */

public class ZhuomiApplication extends Application {
    public static Context AppContext = null;
    @Override
    public void onCreate() {
        super.onCreate();
        AppContext = getApplicationContext();
        Fresco.initialize(AppContext);

    }
}
