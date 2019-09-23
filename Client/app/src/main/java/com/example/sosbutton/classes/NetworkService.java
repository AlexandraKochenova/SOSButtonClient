package com.example.sosbutton.classes;

import com.example.sosbutton.interfaces.ServerApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    private static NetworkService mInstance;
    private final static String BASE_URL = "http://0.0.0.0:3149";
    private Retrofit mRetrofit;

    private NetworkService(){
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static NetworkService getInstance(){
        if (mInstance == null) {
            mInstance = new NetworkService();
        }
        return mInstance;
    }

    public ServerApi getJSONApi() {
        return mRetrofit.create(ServerApi.class);
    }

}
