package com.example.retrofit;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface ApiInterface {
    @GET("/retrofit/getuser.php")
    public void getUserList(Callback<List<UserListResponse>> callback);
}
