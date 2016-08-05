package com.example.fuwu;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    private Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.btn_send);
        mBtn = (Button) findViewById(R.id.btn_stop);
        mButton.setOnClickListener(this);
        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mButton){
            BroadcastDemo broadcastDemo = new BroadcastDemo();
            IntentFilter filter = new IntentFilter("android.intent.action.BROADCAST");
            registerReceiver(broadcastDemo,filter);
//            Intent intent = new Intent();
//            sendBroadcast(intent);
        }
        if(v == mBtn){
            BroadcastDemo broadcastDemo = new BroadcastDemo();
            unregisterReceiver(broadcastDemo);
//            Intent  intent = new Intent(this,MyService.class);
//            ServiceConnection conn = new ServiceConnection() {
//                @Override
//                public void onServiceConnected(ComponentName name, IBinder service) {
//
//                }
//
//                @Override
//                public void onServiceDisconnected(ComponentName name) {
//
//                }
//            };
//            unbindService(conn);
        }


    }


}
