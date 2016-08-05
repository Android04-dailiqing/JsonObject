package com.example.fuwu;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
        Log.d("TAG", "MyService: start");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
       return null;
    }

    @Override
    public void onCreate() {
////        Log.d("TAG", "onCreate: start ");
//        super.onCreate();
////        new Thread(new Runnable() {
////            @Override
////            public void run() {
////
////                for (int count = 0; count <= 10000; count++){
////                    if (fibonacci(count)>=100000){
////                        return;
////                    }
////                    Log.d("TAG", "第"+count+"次"+"数值"+fibonacci(count));
////                    try {
////                        Thread.sleep(500);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
////                }
////            }
////        }).start();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public static long fibonacci(long number) {
            if ((number == 0) || (number == 1))
                return number;
            else
                return fibonacci(number - 1) + fibonacci(number - 2);
        }
      
}
