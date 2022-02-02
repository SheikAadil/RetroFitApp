package com.legendtechlabs.retrofitapp;

import com.google.gson.annotations.SerializedName;

public class DataModel {

    private int userId;
    private int id;
    private String title;
    private Boolean completed;


//    @SerializedName("completed")
//    private Boolean status;


    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean IsCompleted() {
        return completed;
    }
}
