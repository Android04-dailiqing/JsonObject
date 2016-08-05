package com.example.jsonobject.bean;

/**
 * Created by admin on 2016/8/4.
 */
public class Pm25Bean {
    private String cityName;
    private String dateTime;
    private String key;
    /**
     * curPm : 147
     * des : 易感人群症状有轻度加剧，健康人群出现刺激症状。建议儿童、老年人及心脏病和呼吸系统疾病患者应减少长时间、高强度的户外锻炼。
     * level : 3
     * pm10 : 147
     * pm25 : 87
     * quality : 轻度污染
     */

    private PM25Bean pm25;
    private int show_desc;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public PM25Bean getPM25() {
        return pm25;
    }

    public void setPM25(PM25Bean pm25) {
        this.pm25 = pm25;
    }

    public int getShow_desc() {
        return show_desc;
    }

    public void setShow_desc(int show_desc) {
        this.show_desc = show_desc;
    }

    public static class PM25Bean {
        private String curPm;
        private String des;
        private int    level;
        private String pm10;
        private String pm25;
        private String quality;

        public String getCurPm() {
            return curPm;
        }

        public void setCurPm(String curPm) {
            this.curPm = curPm;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }
    }
}
