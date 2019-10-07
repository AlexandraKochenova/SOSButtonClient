package com.example.sosbutton.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    @Expose
    private String userId;
    @SerializedName("username")
    @Expose
    private String username;

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String title) {
        this.username = title;
    }
}

