package com.example.fuwu;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by admin on 2016/7/26.
 */
public class BroadcastDemo extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(action.equals("android.intent.action.BROADCAST")){
            Toast.makeText(context,"开启了广播",Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(context,MyService.class);
            ServiceConnection conn = new ServiceConnection() {
                @Override
                public void onServiceConnected(ComponentName name, IBinder service) {
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//
//                            for (int count = 0; count <= 10000; count++){
//                                if (fibonacci(count)>=100000){
//                                    return;
//                                }
//                                Log.d("TAG", "第"+count+"次"+"数值"+fibonacci(count));
//                                try {
//                                    Thread.sleep(500);
//                                } catch (InterruptedException e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                        }
//                    }).start();

                }

                @Override
                public void onServiceDisconnected(ComponentName name) {

                }
            };
            context.bindService(intent1, conn,Context.BIND_AUTO_CREATE);
        }
    }
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
