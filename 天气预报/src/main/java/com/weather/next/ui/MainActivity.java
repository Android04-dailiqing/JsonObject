package com.weather.next.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.azoft.carousellayoutmanager.CarouselLayoutManager;
import com.weather.next.R;
import com.weather.next.adapter.WeatherRecyclerView;
import com.weather.next.bean.JsonBean;
import com.weather.next.bean.WeatherBean;
import com.weather.next.util.HttpUtil;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout           mDrawerLayout;
    private NavigationView         mNavigationView;
    private Toolbar                mToolbar;
    private ActionBarDrawerToggle  mToggle;
    private RecyclerView           mRecyclerView;
    private HttpUtil               mUtil;
    private WeatherRecyclerView    mView ;
    private ArrayList<WeatherBean> mList;
    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            JsonBean obj = (JsonBean) msg.obj;
            mList = (ArrayList<WeatherBean>) obj.getResult().getData().getWeather();
            mView = new WeatherRecyclerView(MainActivity.this,mList);
            mRecyclerView.setAdapter(mView);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.root);
        mNavigationView = (NavigationView) findViewById(R.id.navi);
        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        mRecyclerView = (RecyclerView) findViewById(R.id.rlv_list);
        setSupportActionBar(mToolbar);
        mUtil = new HttpUtil();
        mList = new ArrayList<>();
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mNavigationView.setNavigationItemSelectedListener(this);
        mRecyclerView.setHasFixedSize(true);
        CarouselLayoutManager manager = new CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(manager);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.weather_realtime:

            break;
            case R.id.weather_day:

                break;
            case R.id.weather_week:

                break;

        }

        return false;
    }

    @Override
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mToggle.onOptionsItemSelected(item)|| super.onOptionsItemSelected(item);
    }


    /**
     * 开启线程获得JSON数据和weatherBaen封装的数据
     */
    public void getJsonData(){
        new Thread(){
            @Override
            public void run() {
                super.run();
                String jsonForGET = mUtil.getJsonForGET(MainActivity.this, "济南");
                JsonBean json = mUtil.getJson(jsonForGET);

                Message  message = Message.obtain();
                message.obj =json;
                mHandler.sendMessage(message);
            }
        }.start();
    }
}
