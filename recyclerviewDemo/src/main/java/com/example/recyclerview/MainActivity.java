package com.example.recyclerview;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.azoft.carousellayoutmanager.CarouselLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    String mPath ="http://gank.io/api/random/data/%E7%A6%8F%E5%88%A9/100";
    private ArrayList<ImageBean.ResultsBean> mList;
    String info;
    Util mUtil = new Util();
    private static final String TAG = "MainActivity";
    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            ImageBean obj = (ImageBean) msg.obj;
            ArrayList<ImageBean.ResultsBean> results = (ArrayList<ImageBean.ResultsBean>) obj.getResults();
            MyRecyclerView myRecyclerView = new MyRecyclerView(MainActivity.this, results);
            mRecyclerView.setAdapter(myRecyclerView);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_show);
        mRecyclerView.setHasFixedSize(true);
        mList = new ArrayList<>();
        CarouselLayoutManager manager = new CarouselLayoutManager(CarouselLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        get();
        Log.d(TAG, "onCreate: "+mList);


    }
    public void get(){
        new Thread(){
            @Override
            public void run() {
                super.run();
                info = mUtil.getInfo(mPath);
                 Log.d(TAG, "info: "+info);
                ImageBean json = mUtil.getJson(info);
                Log.d(TAG, "json: "+json);
//                mList = (ArrayList<ImageBean.ResultsBean>) json.getResults();
//                Log.d(TAG, "mList: "+mList.toString());
                Message message = Message.obtain();
                message.obj = json;
                mHandler.sendMessage(message);
            }
        }.start();

    }

}
