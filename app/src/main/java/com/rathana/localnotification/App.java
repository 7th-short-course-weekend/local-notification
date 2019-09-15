package com.rathana.localnotification;

import android.app.Application;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.rathana.localnotification.utils.NotificationHelper;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            NotificationHelper.createChannel(this);
    }
}
