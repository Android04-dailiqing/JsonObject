package com.example.weather;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 2016/8/1.
 */
public class WeatherAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Weather> mList;

    public WeatherAdapter(Context context, ArrayList<Weather> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder ;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = View.inflate(mContext,R.layout.weather_item,null);
            holder.mDate = (TextView) convertView.findViewById(R.id.tv_date);
            holder.mDayInfo = (TextView) convertView.findViewById(R.id.tv_dayinfo);
            holder.mDayMax = (TextView) convertView.findViewById(R.id.tv_daymax);
            holder.mView = (ImageView) convertView.findViewById(R.id.iv_show);
            convertView.setTag(holder);
        }else {
            holder  = (ViewHolder) convertView.getTag();
        }
            holder.mDate.setText("时      间:"+mList.get(position).getDate());
            holder.mDayInfo.setText("白天天气情况:"+mList.get(position).getDay().getInfo());
            holder.mDayMax.setText("白天最高气温:"+mList.get(position).getDay().getMax());
        int i = mList.get(position).getDay().getMin();
        switch ( i){
            case 0:
                holder.mView.setBackgroundResource(R.drawable.zeroqing);
                break;
            case 1:
                holder.mView.setBackgroundResource(R.drawable.oneduoyun);
                break;
            case 2:
                holder.mView.setBackgroundResource(R.drawable.twoying);
                break;
            case 4:
                holder.mView.setBackgroundResource(R.drawable.fourleizhenyu);
                break;
            }
        return convertView;
    }
    private static class ViewHolder{
        TextView mDate;
        TextView mDayInfo;
        TextView mDayMax;
        ImageView mView;
    }
}
