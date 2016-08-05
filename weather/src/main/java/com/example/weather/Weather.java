package com.example.weather;

import java.io.Serializable;

/**
 * Created by admin on 2016/8/1.
 */
public class Weather implements Serializable{
    private String date;
    private Day day;
    private Night night;
    private String nongli;
    private String week;
    private String cityName;

    public Weather(String date, Day day, Night night, String nongli, String week, String cityName ) {
        this.date = date;
        this.day = day;
        this.night = night;
        this.nongli = nongli;
        this.week = week;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "date='" + date + '\'' +
                ", day=" + day +
                ", night=" + night +
                ", nongli='" + nongli + '\'' +
                ", week='" + week + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Night getNight() {
        return night;
    }

    public void setNight(Night night) {
        this.night = night;
    }

    public String getNongli() {
        return nongli;
    }

    public void setNongli(String nongli) {
        this.nongli = nongli;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
