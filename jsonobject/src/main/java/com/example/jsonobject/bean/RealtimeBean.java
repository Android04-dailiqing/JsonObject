package com.example.jsonobject.bean;

/**
 * Created by admin on 2016/8/4.
 */
public class RealtimeBean {
    private String city_code;
    private String city_name;
    private int    dataUptime;
    private String date;
    private String moon;
    private String time;
    /**
     * humidity : 72
     * img : 1
     * info : 多云
     * temperature : 29
     */

    private WeatherBean weather;
    private int week;
    /**
     * direct : 北风
     * power : 0级
     * windspeed : 7.0
     */

    private WindBean wind;

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getDataUptime() {
        return dataUptime;
    }

    public void setDataUptime(int dataUptime) {
        this.dataUptime = dataUptime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMoon() {
        return moon;
    }

    public void setMoon(String moon) {
        this.moon = moon;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public WeatherBean getWeather() {
        return weather;
    }

    public void setWeather(WeatherBean weather) {
        this.weather = weather;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public WindBean getWind() {
        return wind;
    }

    public void setWind(WindBean wind) {
        this.wind = wind;
    }

    public static class WeatherBean {
        private String humidity;
        private String img;
        private String info;
        private String temperature;

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }
    }

    public static class WindBean {
        private String direct;
        private String power;
        private String windspeed;

        public String getDirect() {
            return direct;
        }

        public void setDirect(String direct) {
            this.direct = direct;
        }

        public String getPower() {
            return power;
        }

        public void setPower(String power) {
            this.power = power;
        }

        public String getWindspeed() {
            return windspeed;
        }

        public void setWindspeed(String windspeed) {
            this.windspeed = windspeed;
        }
    }
}
