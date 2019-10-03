package com.example.foregroundserviceexample;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
    public static final String CHANNEL_ID ="exampleServiceChannel";


    @Override
    public void onCreate() {
        super.onCreate();

        createNotificationchannel();
    }
    private void createNotificationchannel(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            CharSequence name;
            NotificationChannel servicechannel = new NotificationChannel(CHANNEL_ID,
                    "Example Service Channel",
                    NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(servicechannel);

        }
    }
}
