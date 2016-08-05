package com.example.jsonobject.bean;

import java.util.List;

/**
 * Created by admin on 2016/8/4.
 */
public class JsonBean {
    /**
     * error_code : 0
     * reason : successed!
     * result : {"data":{"isForeign":0,"life":{"date":"2016-8-4","info":{"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}},"pm25":{"cityName":"济南","dateTime":"2016年08月04日15时","key":"","pm25":{"curPm":"147","des":"易感人群症状有轻度加剧，健康人群出现刺激症状。建议儿童、老年人及心脏病和呼吸系统疾病患者应减少长时间、高强度的户外锻炼。","level":3,"pm10":"147","pm25":"87","quality":"轻度污染"},"show_desc":0},"realtime":{"city_code":"101120101","city_name":"济南","dataUptime":1470294000,"date":"2016-08-04","moon":"七月初二","time":"14:00:00","weather":{"humidity":"72","img":"1","info":"多云","temperature":"29"},"week":4,"wind":{"direct":"北风","power":"0级","windspeed":"7.0"}},"weather":[{"date":"2016-08-04","info":{"day":["4","雷阵雨","31","东风","微风","05:20"],"night":["1","多云","24","东风","微风","19:15"]},"nongli":"七月初二","week":"四"},{"date":"2016-08-05","info":{"dawn":["1","多云","24","东风","微风","19:15"],"day":["4","雷阵雨","31","东风","微风","05:21"],"night":["1","多云","24","南风","微风","19:14"]},"nongli":"七月初三","week":"五"},{"date":"2016-08-06","info":{"dawn":["1","多云","24","南风","微风","19:14"],"day":["4","雷阵雨","30","南风","微风","05:22"],"night":["1","多云","24","南风","微风","19:13"]},"nongli":"七月初四","week":"六"},{"date":"2016-08-07","info":{"dawn":["1","多云","24","南风","微风","19:13"],"day":["1","多云","32","南风","微风","05:23"],"night":["1","多云","25","南风","微风","19:12"]},"nongli":"七月初五","week":"日"},{"date":"2016-08-08","info":{"dawn":["1","多云","25","南风","微风","19:12"],"day":["1","多云","33","南风","微风","05:23"],"night":["1","多云","25","南风","微风","19:11"]},"nongli":"七月初六","week":"一"},{"date":"2016-08-09","info":{"day":["4","雷阵雨","32","西南风","微风","07:30"],"night":["0","晴","24","西南风","微风","19:30"]},"nongli":"七月初七","week":"二"},{"date":"2016-08-10","info":{"day":["0","晴","33","西南风","微风","07:30"],"night":["0","晴","26","西南风","微风","19:30"]},"nongli":"七月初八","week":"三"}]}}
     */

    private int error_code;
    private String reason;
    /**
     * data : {"isForeign":0,"life":{"date":"2016-8-4","info":{"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}},"pm25":{"cityName":"济南","dateTime":"2016年08月04日15时","key":"","pm25":{"curPm":"147","des":"易感人群症状有轻度加剧，健康人群出现刺激症状。建议儿童、老年人及心脏病和呼吸系统疾病患者应减少长时间、高强度的户外锻炼。","level":3,"pm10":"147","pm25":"87","quality":"轻度污染"},"show_desc":0},"realtime":{"city_code":"101120101","city_name":"济南","dataUptime":1470294000,"date":"2016-08-04","moon":"七月初二","time":"14:00:00","weather":{"humidity":"72","img":"1","info":"多云","temperature":"29"},"week":4,"wind":{"direct":"北风","power":"0级","windspeed":"7.0"}},"weather":[{"date":"2016-08-04","info":{"day":["4","雷阵雨","31","东风","微风","05:20"],"night":["1","多云","24","东风","微风","19:15"]},"nongli":"七月初二","week":"四"},{"date":"2016-08-05","info":{"dawn":["1","多云","24","东风","微风","19:15"],"day":["4","雷阵雨","31","东风","微风","05:21"],"night":["1","多云","24","南风","微风","19:14"]},"nongli":"七月初三","week":"五"},{"date":"2016-08-06","info":{"dawn":["1","多云","24","南风","微风","19:14"],"day":["4","雷阵雨","30","南风","微风","05:22"],"night":["1","多云","24","南风","微风","19:13"]},"nongli":"七月初四","week":"六"},{"date":"2016-08-07","info":{"dawn":["1","多云","24","南风","微风","19:13"],"day":["1","多云","32","南风","微风","05:23"],"night":["1","多云","25","南风","微风","19:12"]},"nongli":"七月初五","week":"日"},{"date":"2016-08-08","info":{"dawn":["1","多云","25","南风","微风","19:12"],"day":["1","多云","33","南风","微风","05:23"],"night":["1","多云","25","南风","微风","19:11"]},"nongli":"七月初六","week":"一"},{"date":"2016-08-09","info":{"day":["4","雷阵雨","32","西南风","微风","07:30"],"night":["0","晴","24","西南风","微风","19:30"]},"nongli":"七月初七","week":"二"},{"date":"2016-08-10","info":{"day":["0","晴","33","西南风","微风","07:30"],"night":["0","晴","26","西南风","微风","19:30"]},"nongli":"七月初八","week":"三"}]}
     */

    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * isForeign : 0
         * life : {"date":"2016-8-4","info":{"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}}
         * pm25 : {"cityName":"济南","dateTime":"2016年08月04日15时","key":"","pm25":{"curPm":"147","des":"易感人群症状有轻度加剧，健康人群出现刺激症状。建议儿童、老年人及心脏病和呼吸系统疾病患者应减少长时间、高强度的户外锻炼。","level":3,"pm10":"147","pm25":"87","quality":"轻度污染"},"show_desc":0}
         * realtime : {"city_code":"101120101","city_name":"济南","dataUptime":1470294000,"date":"2016-08-04","moon":"七月初二","time":"14:00:00","weather":{"humidity":"72","img":"1","info":"多云","temperature":"29"},"week":4,"wind":{"direct":"北风","power":"0级","windspeed":"7.0"}}
         * weather : [{"date":"2016-08-04","info":{"day":["4","雷阵雨","31","东风","微风","05:20"],"night":["1","多云","24","东风","微风","19:15"]},"nongli":"七月初二","week":"四"},{"date":"2016-08-05","info":{"dawn":["1","多云","24","东风","微风","19:15"],"day":["4","雷阵雨","31","东风","微风","05:21"],"night":["1","多云","24","南风","微风","19:14"]},"nongli":"七月初三","week":"五"},{"date":"2016-08-06","info":{"dawn":["1","多云","24","南风","微风","19:14"],"day":["4","雷阵雨","30","南风","微风","05:22"],"night":["1","多云","24","南风","微风","19:13"]},"nongli":"七月初四","week":"六"},{"date":"2016-08-07","info":{"dawn":["1","多云","24","南风","微风","19:13"],"day":["1","多云","32","南风","微风","05:23"],"night":["1","多云","25","南风","微风","19:12"]},"nongli":"七月初五","week":"日"},{"date":"2016-08-08","info":{"dawn":["1","多云","25","南风","微风","19:12"],"day":["1","多云","33","南风","微风","05:23"],"night":["1","多云","25","南风","微风","19:11"]},"nongli":"七月初六","week":"一"},{"date":"2016-08-09","info":{"day":["4","雷阵雨","32","西南风","微风","07:30"],"night":["0","晴","24","西南风","微风","19:30"]},"nongli":"七月初七","week":"二"},{"date":"2016-08-10","info":{"day":["0","晴","33","西南风","微风","07:30"],"night":["0","晴","26","西南风","微风","19:30"]},"nongli":"七月初八","week":"三"}]
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            private int isForeign;
            /**
             * date : 2016-8-4
             * info : {"chuanyi":["热","天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"wuran":["良","气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"yundong":["较不宜","有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意携带雨具并注意避雨防滑。"],"ziwaixian":["中等","属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"]}
             */

            private LifeBean          life;
            /**
             * cityName : 济南
             * dateTime : 2016年08月04日15时
             * key :
             * pm25 : {"curPm":"147","des":"易感人群症状有轻度加剧，健康人群出现刺激症状。建议儿童、老年人及心脏病和呼吸系统疾病患者应减少长时间、高强度的户外锻炼。","level":3,"pm10":"147","pm25":"87","quality":"轻度污染"}
             * show_desc : 0
             */

            private Pm25Bean          pm25;
            /**
             * city_code : 101120101
             * city_name : 济南
             * dataUptime : 1470294000
             * date : 2016-08-04
             * moon : 七月初二
             * time : 14:00:00
             * weather : {"humidity":"72","img":"1","info":"多云","temperature":"29"}
             * week : 4
             * wind : {"direct":"北风","power":"0级","windspeed":"7.0"}
             */

            private RealtimeBean      realtime;
            /**
             * date : 2016-08-04
             * info : {"day":["4","雷阵雨","31","东风","微风","05:20"],"night":["1","多云","24","东风","微风","19:15"]}
             * nongli : 七月初二
             * week : 四
             */

            private List<WeatherBean> weather;

            public int getIsForeign() {
                return isForeign;
            }

            public void setIsForeign(int isForeign) {
                this.isForeign = isForeign;
            }

            public LifeBean getLife() {
                return life;
            }

            public void setLife(LifeBean life) {
                this.life = life;
            }

            public Pm25Bean getPm25() {
                return pm25;
            }

            public void setPm25(Pm25Bean pm25) {
                this.pm25 = pm25;
            }

            public RealtimeBean getRealtime() {
                return realtime;
            }

            public void setRealtime(RealtimeBean realtime) {
                this.realtime = realtime;
            }

            public List<WeatherBean> getWeather() {
                return weather;
            }

            public void setWeather(List<WeatherBean> weather) {
                this.weather = weather;
            }
        }
    }
}
