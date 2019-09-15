package com.rathana.localnotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rathana.localnotification.utils.NotificationHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void  onNormalClicked(View view){
        NotificationHelper.createNormalNotification(this);
    }

    void  onNFWithBigTextStyleClicked(View v){
        //NotificationHelper.createNotificationWithBigTextStyle(this);
        NotificationHelper.createNotificationWithBigPictureStyle(this);
    }

}
