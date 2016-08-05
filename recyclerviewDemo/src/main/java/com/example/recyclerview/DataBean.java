package com.example.recyclerview;

/**
 * Created by admin on 2016/8/5.
 */
public class DataBean {
    String imgUrl;
    String name;

    public DataBean(String imgUrl, String name) {
        this.imgUrl = imgUrl;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DataBean{" +
                "name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
