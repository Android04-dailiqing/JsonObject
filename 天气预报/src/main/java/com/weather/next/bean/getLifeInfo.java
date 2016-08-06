package com.weather.next.bean;


import com.weather.next.util.HttpUtil;

import java.util.ArrayList;

/**
 * Created by admin on 2016/8/4.
 */
public class getLifeInfo {
    private HttpUtil mUtil = new HttpUtil();

    /**
     * 传进来JSON直接返回一个含生活类详细信息的字符串
     * @param str 参数为 JSON 字符串
     * @return 一个字符串
     */
    public StringBuffer getLife(String str){
        StringBuffer mBuffer = new StringBuffer();
        mBuffer.append("时    间:"+mUtil.getJson(str).getResult().getData().getLife().getDate()+"\n");
        mBuffer.append("穿衣指数:"+mUtil.getJson(str).getResult().getData().getLife().getInfo().getChuanyi().get(1)+"\n");
        mBuffer.append("感冒指数:"+mUtil.getJson(str).getResult().getData().getLife().getInfo().getGanmao().get(1)+"\n");
        mBuffer.append("空调指数:"+mUtil.getJson(str).getResult().getData().getLife().getInfo().getKongtiao().get(1)+"\n");
        mBuffer.append("污染指数:"+mUtil.getJson(str).getResult().getData().getLife().getInfo().getWuran().get(1)+"\n");
        mBuffer.append("洗车指数:"+mUtil.getJson(str).getResult().getData().getLife().getInfo().getXiche().get(1)+"\n");
        mBuffer.append("运动指数:"+mUtil.getJson(str).getResult().getData().getLife().getInfo().getYundong().get(1)+"\n");
        mBuffer.append("紫 外 线:"+mUtil.getJson(str).getResult().getData().getLife().getInfo().getZiwaixian().get(1));
       return mBuffer;
    }

    /**
     * 传进来JSON直接返回一个含PM2.5详细信息的字符串
     * @param str 参数为 JSON 字符串
     * @return 一个字符串
     */
    public StringBuffer getPm25(String str){
        StringBuffer mBuffer = new StringBuffer();
        mBuffer.append("地区:"+mUtil.getJson(str).getResult().getData().getPm25().getCityName()+"\n");
        mBuffer.append("时间:"+mUtil.getJson(str).getResult().getData().getPm25().getDateTime()+"\n");
        mBuffer.append("CURPM:"+mUtil.getJson(str).getResult().getData().getPm25().getPM25().getCurPm()+"\n");
        mBuffer.append("DES:"+mUtil.getJson(str).getResult().getData().getPm25().getPM25().getDes()+"\n");
        mBuffer.append("LEVEL:"+mUtil.getJson(str).getResult().getData().getPm25().getPM25().getLevel()+"\n");
        mBuffer.append("PM10:"+mUtil.getJson(str).getResult().getData().getPm25().getPM25().getPm10()+"\n");
        mBuffer.append("PM2.5:"+mUtil.getJson(str).getResult().getData().getPm25().getPM25().getPm25()+"\n");
        mBuffer.append("污染程度:"+mUtil.getJson(str).getResult().getData().getPm25().getPM25().getQuality());
        return mBuffer;
    }

    /**
     * 传进来JSON直接返回一个含实时天气信息的字符串
     * @param str 参数为 JSON 字符串
     * @return 一个字符串
     */
    public StringBuffer getRealTime(String str){
        StringBuffer mBuffer = new StringBuffer();
        mBuffer.append("地区:"+mUtil.getJson(str).getResult().getData().getRealtime().getCity_name()+"\n");
        mBuffer.append("日期:"+mUtil.getJson(str).getResult().getData().getRealtime().getDate()+"\n");
        mBuffer.append("农历:"+mUtil.getJson(str).getResult().getData().getRealtime().getMoon()+"\n");
        mBuffer.append("时间:"+mUtil.getJson(str).getResult().getData().getRealtime().getTime()+"\n");
        int week = mUtil.getJson(str).getResult().getData().getRealtime().getWeek();
        String week1 = getWeek(week);
        mBuffer.append("星期:"+week1+"\n");
        mBuffer.append("湿度:"+mUtil.getJson(str).getResult().getData().getRealtime().getWeather().getHumidity()+"\n");
        mBuffer.append("天气:"+mUtil.getJson(str).getResult().getData().getRealtime().getWeather().getInfo()+"\n");
        mBuffer.append("温度:"+mUtil.getJson(str).getResult().getData().getRealtime().getWeather().getTemperature()+"\n");
        mBuffer.append("风向:"+mUtil.getJson(str).getResult().getData().getRealtime().getWind().getDirect()+"\n");
        mBuffer.append("风力:"+mUtil.getJson(str).getResult().getData().getRealtime().getWind().getPower()+"\n");
        mBuffer.append("风速:"+mUtil.getJson(str).getResult().getData().getRealtime().getWind().getWindspeed());
        return mBuffer;
    }

    /**
     * 传进来JSON直接返回一个含七天天气信息的LIST集合
     * @param str 参数为 JSON 字符串
     * @return
     */
    public ArrayList<WeatherBean> getWeather(String str){
        ArrayList<WeatherBean> list = new ArrayList<>();
        list = (ArrayList<WeatherBean>) mUtil.getJson(str).getResult().getData().getWeather();
        return list;
    }
    /**
     * 数字转化为汉字的星期几
     * @param str 传入跟JSON中或者去出来的Week字段返回的int值
     * @return 一个字符串
     */
    public String getWeek(int str){
        switch (str){
            case 1:
                return "一";

            case 2:
                return "二";

            case 3:
                return "三";

            case 4:
                return "四";

            case 5:
                return "五";

            case 6:
                return "六";

            case 7:
                return "日";

        }
        return null;
    }
}
