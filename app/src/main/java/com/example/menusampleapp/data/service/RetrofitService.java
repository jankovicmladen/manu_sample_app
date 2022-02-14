package com.example.menusampleapp.data.service;

import com.example.menusampleapp.data.api.SampleApi;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitService {

    private static final String URL = "https://api-playground.menu.app/api/";

    private final SampleApi sampleApi;

    private static RetrofitService singleton;

    private RetrofitService() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(chain -> {
            Request original = chain.request();

            Request request = original.newBuilder()
                    .header("application", "mobile-application")
                    .header("Content-Type", "application/json")
                    .header("Device-UUID", "123456")
                    .header("Api-Version", "3.7.0")
                    .method(original.method(), original.body())
                    .build();

            return chain.proceed(request);
        });

        OkHttpClient client = httpClient.build();

        Retrofit mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .baseUrl(URL).build();

        sampleApi = mRetrofit.create(SampleApi.class);
    }

    public static RetrofitService getInstance() {
        if (singleton == null) {
            synchronized (RetrofitService.class) {
                if (singleton == null) {
                    singleton = new RetrofitService();
                }
            }
        }
        return singleton;
    }

    public SampleApi getSampleApi() {
        return sampleApi;
    }

}
