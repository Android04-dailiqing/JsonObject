package com.weather.next.util;

import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;
import com.weather.next.bean.JsonBean;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by admin on 2016/8/4.
 */
public class HttpUtil {
    private OkHttpClient mHttpClient = new OkHttpClient();
    private Request mRequest;
    private Response mResponse;
    private FormBody mBody;
    private String mPath = "http://op.juhe.cn/onebox/weather/query";
    private String mJs;
    private String mUrlString = "http://op.juhe.cn/onebox/weather/query?cityname=";
    private String mUrlEnd = "&dtype=&key=8a81ad7f1fe07aa8dc3e28fd39a9a604";

    /**
     * 通过GET请获取JSON
     * @param context 上下文
     * @param encode   请求参数 代表城市名称
     * @return
     */
    public  String getJsonForGET(Context context,String encode){
        String cityName = null;
        try {
            cityName = URLEncoder.encode(encode, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        mRequest = new Request.Builder().url(mUrlString+cityName+mUrlEnd).build();
        try {
            mResponse = mHttpClient.newCall(mRequest).execute();
            if (mResponse.isSuccessful()){
                return mResponse.body().string();
            }else {
                Toast.makeText(context,"请求失败",Toast.LENGTH_SHORT).show();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 通过POST方法获取JSON
     * @param context 上下文
     * @param encode 请求参数 代表城市名称
     * @return
     */
    public String getJsonForPOST(final Context context, String encode){
        String cityName = URLEncoder.encode(encode);
        mBody = new FormBody.Builder().add("cityname",cityName).add("dtype","json").add("key","8a81ad7f1fe07aa8dc3e28fd39a9a604").build();
        mRequest = new Request.Builder().url(mPath).post(mBody).build();
        mHttpClient.newCall(mRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Toast.makeText(context,"请求失败",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                 mJs = response.body().string();
            }
        });
        return mJs;
    }

    /**
     * 通过Gson 解析GSON 然后一个实体的JsonBean对象
     * @param str 传入的是一个Json
     * @return
     */
    public JsonBean getJson(String str){
        Gson gson = new Gson();
        JsonBean jsonBean = gson.fromJson(str, JsonBean.class);
        return  jsonBean;
    }
}
