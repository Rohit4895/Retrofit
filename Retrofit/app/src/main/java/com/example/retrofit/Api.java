package com.example.retrofit;

import retrofit.RestAdapter;

public class Api {
    public static ApiInterface getClient(){
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://mobileappdatabase.in/")
                .build();
        ApiInterface api = restAdapter.create(ApiInterface.class);
        return api;

    }
}
