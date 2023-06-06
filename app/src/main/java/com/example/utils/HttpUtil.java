package com.example.utils;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class HttpUtil {

    private static final MediaType JsonNTYPE = MediaType.parse("application/json; charset=utf-8");
    private static OkHttpClient mOkHttpClient = new OkHttpClient();


    public static void sendOkHttpRequest(final String address,final okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(address)
                .build();

        client.newCall(request).enqueue(callback);
    }


    public static Response postJson(String url, String json) throws IOException {

        RequestBody body = RequestBody.create(JsonNTYPE, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = mOkHttpClient.newCall(request).execute();
        return response;
    }

    public static void postJson(String url,String token,okhttp3.Callback callback) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .header("Authorization","Bearer "+token)
                .build();
        mOkHttpClient.newCall(request).enqueue(callback);

    }

    public static void postJson(String url,String token,String json,okhttp3.Callback callback) throws IOException {
        RequestBody body = RequestBody.create(JsonNTYPE, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .header("Authorization","Bearer "+token)
                .build();
        mOkHttpClient.newCall(request).enqueue(callback);
    }

}



