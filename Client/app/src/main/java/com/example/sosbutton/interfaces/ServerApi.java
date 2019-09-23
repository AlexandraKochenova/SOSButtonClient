package com.example.sosbutton.interfaces;

import com.example.sosbutton.classes.Post;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ServerApi {

    @GET("/{username}")
    public Call<Post> getPostWithID(@Path("username") String username);
}
