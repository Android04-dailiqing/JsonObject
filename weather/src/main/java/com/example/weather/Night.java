package com.example.weather;

/**
 * Created by admin on 2016/8/1.
 */
public class Night {
    private int min;
    private String max;
    private String info;
    private String windDirection;
    private String windPower;

    public Night(int min, String max, String info, String windDirection, String windPower) {
        this.min = min;
        this.max = max;
        this.info = info;
        this.windDirection = windDirection;
        this.windPower = windPower;
    }

    @Override
    public String toString() {
        return "Night{" +
                "min=" + min +
                ", max='" + max + '\'' +
                ", info='" + info + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", windPower='" + windPower + '\'' +
                '}';
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindPower() {
        return windPower;
    }

    public void setWindPower(String windPower) {
        this.windPower = windPower;
    }
}
