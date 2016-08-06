package com.weather.next.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.weather.next.R;
import com.weather.next.bean.WeatherBean;

import java.util.ArrayList;

/**
 * Created by admin on 2016/8/6.
 */
public class WeatherRecyclerView extends RecyclerView.Adapter<WeatherRecyclerView.MyViewHodler>{
    private Context mContext;
    private ArrayList<WeatherBean> mList;

    public WeatherRecyclerView(Context context, ArrayList<WeatherBean> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item, null);
        return new MyViewHodler(view);
    }

    @Override
    public void onBindViewHolder(MyViewHodler holder, int position) {
        WeatherBean weatherBean = mList.get(position);
        holder.mTemperature.setText(weatherBean.getInfo().getDay().get(2));
        holder.mTnfo.setText(weatherBean.getInfo().getDay().get(1));
        holder.mWindDirection.setText(weatherBean.getInfo().getDay().get(3));
        holder.mWindPower.setText(weatherBean.getInfo().getDay().get(4));
        holder.mSunUp.setText(weatherBean.getInfo().getDay().get(5));
        holder.mSunDown.setText(weatherBean.getInfo().getNight().get(5));
        holder.mTime.setText(weatherBean.getDate());
        int i = Integer.parseInt(weatherBean.getInfo().getDay().get(0));
        switch (i){
            case  1://1多云 2阴 0晴 4雷阵雨  22中雨到大雨  8中雨  3阵雨
                holder.mImg.setBackgroundResource(R.mipmap.weather_day1);
                break;
            case  2:
                holder.mImg.setBackgroundResource(R.mipmap.weather_day2);
                break;
            case  0:
                holder.mImg.setBackgroundResource(R.mipmap.weather_day0);
                break;
            case  4:
                holder.mImg.setBackgroundResource(R.mipmap.weather_day4);
                break;
            case  22:
                holder.mImg.setBackgroundResource(R.mipmap.weather_day7);
                break;
            case  8:
                holder.mImg.setBackgroundResource(R.mipmap.weather_day8);
                break;
            case  3:
                holder.mImg.setBackgroundResource(R.mipmap.weather_day11);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHodler extends RecyclerView.ViewHolder{
        public TextView  mTemperature;
        public TextView  mTnfo;
        public TextView  mWindDirection;
        public TextView  mWindPower;
        public TextView  mSunUp;
        public TextView  mSunDown;
        public TextView  mTime;
        public ImageView mImg;
        public MyViewHodler(View itemView) {
            super(itemView);
            mTemperature = (TextView) itemView.findViewById(R.id.item_temperature);
            mTnfo = (TextView) itemView.findViewById(R.id.item_info);
            mWindDirection = (TextView) itemView.findViewById(R.id.item_wind_direction);
            mWindPower = (TextView) itemView.findViewById(R.id.item_wind_power);
            mSunUp = (TextView) itemView.findViewById(R.id.item_sunup);
            mSunDown = (TextView) itemView.findViewById(R.id.item_sundown);
            mTime = (TextView) itemView.findViewById(R.id.item_time);
            mImg = (ImageView) itemView.findViewById(R.id.item_img);
        }
    }

}
