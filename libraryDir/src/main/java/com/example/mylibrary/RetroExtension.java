package com.example.mylibrary;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class RetroExtension {

//    This method returns httpClient that has httpLoggingInterceptor
    public OkHttpClient.Builder getLoggingClient() {

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);

        return httpClient;
    }



}
