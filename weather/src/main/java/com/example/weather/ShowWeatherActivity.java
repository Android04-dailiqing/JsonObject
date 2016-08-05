package com.example.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowWeatherActivity extends AppCompatActivity {
    private TextView mCityName;
    private TextView mDate;
    private TextView mWeek;
    private TextView mNongLi;
    private TextView mDayWeather;
    private TextView mDayTemp;
    private TextView mDayWindDirection;
    private TextView mDayWindPower;
    private TextView mNightWeather;
    private TextView mNightDayTemp;
    private TextView mNightDayWindDirection;
    private TextView mNightDayWindPower;
    private String[] datas;
    private ImageView mIvDay;
    private ImageView mIvNight;
    private int mDaymin;
    private int mNightmin;
    private static final String TAG = "ShowWeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_weather);
        Intent intent = getIntent();
        datas = intent.getStringArrayExtra("data");
        for (int i = 0; i < datas.length; i++) {
            Log.d(TAG, "datas: "+datas[i]);
        }
        mDaymin = intent.getIntExtra("daymin",0);
        mNightmin = intent.getIntExtra("nightmin",0);
        init();
        set();

    }

    private void set() {

        mCityName.setText("地区:"+datas[0]);
        mDate.setText("时间:"+datas[1]);
        mNongLi.setText("农历:"+datas[2]);
        mWeek.setText("星期:"+datas[3]);
        mDayWeather.setText("天气情况"+datas[4]);
        mDayTemp.setText("温度"+datas[5]);
        mDayWindDirection.setText("风向:"+datas[6]);
        mDayWindPower.setText("风力:"+datas[7]);
        mNightWeather.setText("天气情况:"+datas[9]);
        mNightDayTemp.setText("温度:"+datas[8]);
        mNightDayWindDirection.setText("风向:"+datas[10]);
        mNightDayWindPower.setText("风力:"+datas[11]);
//        int i = Integer.parseInt(mDaymin);
        switch ( mDaymin){
            case 0:
                mIvDay.setBackgroundResource(R.drawable.zeroqing);
                break;
            case 1:
                mIvDay.setBackgroundResource(R.drawable.oneduoyun);
                break;
            case 2:
                mIvDay.setBackgroundResource(R.drawable.twoying);
                break;
            case 4:
                mIvDay.setBackgroundResource(R.drawable.fourleizhenyu);
                break;
        }
//        int k = Integer.parseInt(mNightmin);
        switch ( mNightmin){
            case 0:
                mIvNight.setBackgroundResource(R.drawable.zeroqing);
                break;
            case 1:
                mIvNight.setBackgroundResource(R.drawable.oneduoyun);
                break;
            case 2:
                mIvNight.setBackgroundResource(R.drawable.twoying);
                break;
            case 4:
                mIvNight.setBackgroundResource(R.drawable.fourleizhenyu);
                break;
        }
    }

    public void init(){
        mCityName = (TextView) findViewById(R.id.tv_diqu);
        mDate = (TextView) findViewById(R.id.tv_time);
        mWeek = (TextView) findViewById(R.id.tv_xingqi);
        mNongLi = (TextView) findViewById(R.id.tv_nongli);
        mDayWeather = (TextView) findViewById(R.id.tv_tianqi);
        mDayTemp = (TextView) findViewById(R.id.tv_wendu);
        mDayWindDirection = (TextView) findViewById(R.id.tv_fengxiang);
        mDayWindPower = (TextView) findViewById(R.id.tv_fengli);
        mNightWeather = (TextView) findViewById(R.id.tv_night_tianqi);
        mNightDayTemp = (TextView) findViewById(R.id.tv_night_wendu);
        mNightDayWindDirection = (TextView) findViewById(R.id.tv_night_fengxiang);
        mNightDayWindPower = (TextView) findViewById(R.id.tv_night_fengli);
        mIvDay = (ImageView) findViewById(R.id.iv_day);
        mIvNight = (ImageView) findViewById(R.id.iv_night);

    }
}
