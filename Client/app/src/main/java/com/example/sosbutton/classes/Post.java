package com.example.sosbutton.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    @Expose
    private int userId;
    @SerializedName("username")
    @Expose
    private String username;

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String title) {
        this.username = title;
    }
}

