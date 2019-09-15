package com.rathana.localnotification.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;

import com.rathana.localnotification.R;

public class NotificationHelper {

    public static final  String CH_ID= "INI_ID";
    public static final  String CH_NAME= "Internal info";


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void createChannel(Context context){
        NotificationChannel channel = new NotificationChannel(CH_ID,CH_NAME, NotificationManager.IMPORTANCE_HIGH);
        channel.setDescription("Use for internal income information");
        channel.setLightColor(Color.RED);
        channel.setLockscreenVisibility(1);
        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.createNotificationChannel(channel);
    }

    public static void createNormalNotification(Context context){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(context,CH_ID);

        builder.setSmallIcon(R.drawable.ic_shopping_cart);
        builder.setContentTitle("Add product to cart");
        builder.setContentText("You have added 10 products to your cart");
        Bitmap bitmap= BitmapFactory.decodeResource(
                context.getResources(),
                R.drawable.ic_shopping_cart
        );

        builder.setLargeIcon(bitmap);
        builder.setTicker("add to cart");
        builder.setContentInfo("content info");
        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        int id=(int) System.currentTimeMillis()/1000;
        notificationManager.notify(id,builder.build());
    }

    public static void createNotificationWithBigTextStyle(Context context){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(context,CH_ID);

        builder.setSmallIcon(R.drawable.ic_shopping_cart);
        builder.setContentTitle("Add product to cart");
        builder.setContentText("You have added 10 products to your cart");
        Bitmap bitmap= BitmapFactory.decodeResource(
                context.getResources(),
                R.drawable.ic_shopping_cart
        );
        builder.setLargeIcon(bitmap);
        builder.setTicker("add to cart");
        builder.setContentInfo("content info");

        NotificationCompat.BigTextStyle style = new NotificationCompat.BigTextStyle();
        style.setBigContentTitle("An alert dialog is a useful tool that alerts the app’s user. It is a pop up in the middle of the screen which places an overlay over the background");
        style.bigText("An alert dialog is a useful tool that alerts the app’s user. It is a pop up in the middle of the screen which places an overlay over the background. Most commonly, it is used to confirm one of the user’s potentially unrevertable actions. In this example, I will the setup to make one of these alert dialogs in the flutter framework. An alert dialog is a useful tool that alerts the app’s user. It is a pop up in the middle of the screen which places an overlay over the background. Most commonly, it is used to confirm one of the user’s potentially unrevertable actions. In this example, I will the setup to make one of these alert dialogs in the flutter framework.");

        builder.setStyle(style);

        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        int id=(int) System.currentTimeMillis()/1000;
        notificationManager.notify(id,builder.build());
    }

    public static void createNotificationWithBigPictureStyle(Context context){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(context,CH_ID);

        builder.setSmallIcon(R.drawable.ic_shopping_cart);
        builder.setContentTitle("Add product to cart");
        builder.setContentText("You have added 10 products to your cart");
        Bitmap bitmap= BitmapFactory.decodeResource(
                context.getResources(),
                R.drawable.ic_shopping_cart
        );
        builder.setLargeIcon(bitmap);
        builder.setTicker("add to cart");
        builder.setContentInfo("content info");

        NotificationCompat.BigPictureStyle style= new NotificationCompat.BigPictureStyle();
        Bitmap bitmap2= BitmapFactory.decodeResource(
                context.getResources(),
                R.drawable.pic_2
        );
        style.bigPicture(bitmap2);
        builder.setStyle(style);

        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        int id=(int) System.currentTimeMillis()/1000;
        notificationManager.notify(id,builder.build());
    }
}
