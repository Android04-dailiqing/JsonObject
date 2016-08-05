package com.example.recyclerview;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by admin on 2016/8/5.
 */
public class Util {
    public ImageBean getJson(String str){
        Gson gson = new Gson();
        ImageBean jsonBean = gson.fromJson(str, ImageBean.class);
        return  jsonBean;
    }
    public String getInfo(String url){

        String string = new String();
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = httpClient.newCall(request).execute();
            if(response.isSuccessful()){
                return response.body().string();
            }else {
//                Toast.makeText(this,"请求参数有误",Toast.LENGTH_SHORT).show();
                System.out.print("请求参数有误");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
