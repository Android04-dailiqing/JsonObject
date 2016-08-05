package com.example.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String   mPath;
    private TextView mCityName;
    private TextView mDateTime;
    private ListView mView;
    private static final String TAG = "MainActivity";
    private EditText mText;
    private String   encode;
    private OkHttpClient mClient = new OkHttpClient();
    private String             path1;
    private WeatherAdapter     adapter;
    private ArrayList<Weather> mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPath = "http://op.juhe.cn/onebox/weather/query?cityname=";
        path1 = "&dtype=&key=8a81ad7f1fe07aa8dc3e28fd39a9a604";
//        mPath = "http://op.juhe.cn/onebox/weather/query";
        mView = (ListView) findViewById(R.id.lv_weatherlist);
        mCityName = (TextView) findViewById(R.id.tv_cityName);
        mDateTime = (TextView) findViewById(R.id.tv_dateTime);
        mText = (EditText) findViewById(R.id.et_city);


    }

    public void commit(View view) {
        mlist = new ArrayList<>();
        String trim = mText.getText().toString().trim();
        try {
            encode = URLEncoder.encode(trim, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                FormBody body = new FormBody.Builder().add("cityname",encode).add("dtype","json").add("key","8a81ad7f1fe07aa8dc3e28fd39a9a604").build();
//                Log.d(TAG, "body: "+body.toString());
//                Request request = new Request.Builder().url(mPath).post(body).build();
//                Log.d(TAG, "request: "+request);
//                mClient.newCall(request).enqueue(new Callback() {
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//                        Toast.makeText(MainActivity.this,"请求出错",Toast.LENGTH_SHORT).show();
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//
//
//                        JSONObject json = null;
//                        try {
//                            json = new JSONObject(response.body().string());
//                            JSONObject result = json.getJSONObject("result");
//                            JSONObject data = result.getJSONObject("data");
//                            JSONObject realtime = data.getJSONObject("realtime");
//                            final String cityName =  realtime.getString("city_name");
//
//                            JSONObject pm25 = data.getJSONObject("pm25");
//                            final String dateTime = pm25.getString("dateTime");
//                            JSONArray weather = data.getJSONArray("weather");
//                            Log.d(TAG, "weather: "+weather);
//                            for (int i = 0; i <weather.length() ; i++) {
//                                JSONObject object = weather.getJSONObject(i);
//                                String date = object.getString("date");
//                                String nongli = object.getString("nongli");
//                                String week = object.getString("week");
//                                JSONObject info = object.getJSONObject("info");
//                                JSONArray day = info.getJSONArray("day");
//                                String min = day.getString(0);
//                                String info1 = day.getString(1);
//                                String max = day.getString(2);
//                                JSONArray night = info.getJSONArray("night");
//                                String min1 = night.getString(0);
//                                String info2 = night.getString(1);
//                                String max1 = night.getString(2);
//                                Day day1 = new Day(min, max, info1);
//                                Night night1 = new Night(min1, max1,info2);
//                                Weather weather1 = new Weather(date, day1, night1, nongli, week);
//                                mlist.add(weather1);
//                            }
//                            runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                mCityName.setText("城市名称:"+cityName);
//                                mDateTime.setText("时        间"+dateTime);
//                            }
//                        });
//
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//
//                    }
//                });
//
//
//            }
//        }.start();
        //GET方法请求
        new Thread() {
            @Override
            public void run() {
                super.run();

                Request request = new Request.Builder().url(mPath + encode + path1).build();
                try {
                    Response response = mClient.newCall(request).execute();
                    if (response.isSuccessful()) {
                        JSONObject json = new JSONObject(response.body().string());
                        JSONObject result = json.getJSONObject("result");
                        JSONObject data = result.getJSONObject("data");
                        JSONObject realtime = data.getJSONObject("realtime");
                        final String cityName = realtime.getString("city_name");
                        JSONObject pm25 = data.getJSONObject("pm25");
                        final String dateTime = pm25.getString("dateTime");
                        JSONArray weather = data.getJSONArray("weather");
                        Log.d(TAG, "weather: " + weather);
                        for (int i = 0; i < weather.length(); i++) {
                            JSONObject object = weather.getJSONObject(i);
                            String date = object.getString("date");
                            String nongli = object.getString("nongli");
                            String week = object.getString("week");
                            JSONObject info = object.getJSONObject("info");
                            JSONArray day = info.getJSONArray("day");
                            int min = day.getInt(0);
                            String info1 = day.getString(1);
                            String max = day.getString(2);
                            String windDirection = day.getString(3);
                            String windPower = day.getString(4);
                            JSONArray night = info.getJSONArray("night");
                            int nightmin = night.getInt(0);
                            String nightinfo = night.getString(1);
                            String nightmax = night.getString(2);
                            String nightwindDirection = night.getString(3);
                            String nightwindPower = night.getString(4);
                            Day day1 = new Day(min, max, info1, windDirection, windPower);
                            Night night1 = new Night(nightmin, nightinfo, nightmax, nightwindDirection, nightwindPower);
                            Weather weather1 = new Weather(date, day1, night1, nongli, week, cityName);
                            mlist.add(weather1);

                        }
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
//                                mCityName.setText("城市名称:"+cityName);
//                                mDateTime.setText("时        间"+dateTime);
                                mView.setAdapter(new WeatherAdapter(MainActivity.this, mlist));
                                Log.d(TAG, "setAdapter: "+mlist.toString());
                                mView.setOnItemClickListener(MainActivity.this);
                            }
                        });
                    } else {
                        Toast.makeText(MainActivity.this, "请求出错", Toast.LENGTH_SHORT).show();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }.start();


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MainActivity.this, ShowWeatherActivity.class);
        String[] data = {mlist.get(position).getCityName(), mlist.get(position).getDate(), mlist.get(position).getNongli(), mlist.get(position).getWeek(),
                mlist.get(position).getDay().getInfo(), mlist.get(position).getDay().getMax(),
                mlist.get(position).getDay().getWindDirection(), mlist.get(position).getDay().getWindPower(),
                mlist.get(position).getNight().getInfo(), mlist.get(position).getNight().getMax(), mlist.get(position).getNight().getWindDirection(),
                mlist.get(position).getNight().getWindPower()
        };
        for (int i = 0; i < data.length; i++) {
            Log.d(TAG, "data: "+data[i]);
        }
        intent.putExtra("data", data);
        intent.putExtra("daymin",mlist.get(position).getDay().getMin());
        Log.d(TAG, "白天ID: "+mlist.get(position).getDay().getMin());
        intent.putExtra("nightmin",mlist.get(position).getNight().getMin());
        Log.d(TAG, "夜晚ID: "+mlist.get(position).getNight().getMin());
        startActivity(intent);
    }
}
