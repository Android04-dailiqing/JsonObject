package com.example.recyclerview;

import java.util.List;

/**
 * Created by admin on 2016/8/5.
 */
public class ImageBean {
    /**
     * error : false
     * results : [{"_id":"56cc6d1d421aa95caa70758f","createdAt":"2015-10-30T01:54:13.811Z","desc":"10.30","publishedAt":"2015-10-30T03:50:54.394Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exixcxfj12j20in0rsgp0.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707642","createdAt":"2015-07-15T03:56:42.772Z","desc":"7.15","publishedAt":"2015-07-15T04:05:29.732Z","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1eu3bld296jj20df0kudhx.jpg","used":true,"who":"小贝"},{"_id":"56cc6d1c421aa95caa707523","createdAt":"2015-11-04T10:33:50.564Z","desc":"11.5","publishedAt":"2015-11-05T04:02:52.968Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exp4h479xfj20hs0qoq6t.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7076b4","createdAt":"2015-06-23T02:00:00.619Z","desc":"6.23","publishedAt":"2016-05-03T12:13:53.904Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1etdsksgctqj20hs0qowgy.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa707534","createdAt":"2015-11-13T03:57:41.206Z","desc":"11.13","publishedAt":"2015-11-13T04:03:12.613Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1exz7lm0ow0j20qo0hrjud.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70755a","createdAt":"2015-10-26T01:16:49.787Z","desc":"10.26","publishedAt":"2015-10-26T03:52:58.746Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1exe9ssy2gsj20qo0hndjr.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7076b4","createdAt":"2015-06-23T02:00:00.619Z","desc":"6.23","publishedAt":"2016-05-03T12:13:53.904Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1etdsksgctqj20hs0qowgy.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075b1","createdAt":"2015-11-02T23:46:36.247Z","desc":"11.3","publishedAt":"2015-11-03T06:04:59.454Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1exng5dd728j20go0m877n.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707642","createdAt":"2015-07-15T03:56:42.772Z","desc":"7.15","publishedAt":"2015-07-15T04:05:29.732Z","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1eu3bld296jj20df0kudhx.jpg","used":true,"who":"小贝"},{"_id":"56cc6d1d421aa95caa70757d","createdAt":"2015-10-29T01:49:31.473Z","desc":"10.29","publishedAt":"2015-10-29T04:40:26.424Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1exhrgo769bj20ox0zk42e.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707678","createdAt":"2015-06-05T01:05:18.878Z","desc":"6.5\u2014\u2014（1）","publishedAt":"2015-06-05T03:54:29.403Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1essxulfqxxj20hr0qo77f.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa707534","createdAt":"2015-11-13T03:57:41.206Z","desc":"11.13","publishedAt":"2015-11-13T04:03:12.613Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1exz7lm0ow0j20qo0hrjud.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075a6","createdAt":"2015-11-02T03:53:25.557Z","desc":"11.2","publishedAt":"2015-11-02T04:16:06.443Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1exmhnx76z9j20go0dcabp.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075c5","createdAt":"2015-05-20T02:08:17.148Z","desc":"5.20。\n520爱你，就给你甜甜的笑。今日特推！~~（づ￣3￣）づ╭❤～","publishedAt":"2015-05-21T10:05:06.527Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bgw1esahpyv86sj20hs0qomzo.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075c5","createdAt":"2015-05-20T02:08:17.148Z","desc":"5.20。\n520爱你，就给你甜甜的笑。今日特推！~~（づ￣3￣）づ╭❤～","publishedAt":"2015-05-21T10:05:06.527Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bgw1esahpyv86sj20hs0qomzo.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075c5","createdAt":"2015-05-20T02:08:17.148Z","desc":"5.20。\n520爱你，就给你甜甜的笑。今日特推！~~（づ￣3￣）づ╭❤～","publishedAt":"2015-05-21T10:05:06.527Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bgw1esahpyv86sj20hs0qomzo.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7076b4","createdAt":"2015-06-23T02:00:00.619Z","desc":"6.23","publishedAt":"2016-05-03T12:13:53.904Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1etdsksgctqj20hs0qowgy.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075c5","createdAt":"2015-05-20T02:08:17.148Z","desc":"5.20。\n520爱你，就给你甜甜的笑。今日特推！~~（づ￣3￣）づ╭❤～","publishedAt":"2015-05-21T10:05:06.527Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bgw1esahpyv86sj20hs0qomzo.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70752b","createdAt":"2015-11-06T01:54:17.536Z","desc":"11.6","publishedAt":"2015-11-06T04:11:25.973Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exr0p4r0h3j20oy15445o.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707678","createdAt":"2015-06-05T01:05:18.878Z","desc":"6.5\u2014\u2014（1）","publishedAt":"2015-06-05T03:54:29.403Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1essxulfqxxj20hr0qo77f.jpg","used":true,"who":"张涵宇"}]
     */

    private boolean           error;
    /**
     * _id : 56cc6d1d421aa95caa70758f
     * createdAt : 2015-10-30T01:54:13.811Z
     * desc : 10.30
     * publishedAt : 2015-10-30T03:50:54.394Z
     * type : 福利
     * url : http://ww4.sinaimg.cn/large/7a8aed7bgw1exixcxfj12j20in0rsgp0.jpg
     * used : true
     * who : 张涵宇
     */

    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String  _id;
        private String  createdAt;
        private String  desc;
        private String  publishedAt;
        private String  type;
        private String  url;
        private boolean used;
        private String  who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
