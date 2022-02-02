package com.legendtechlabs.retrofitapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {

//    https://jsonkeeper.com/    b/BQKX
    @GET("b/BQKX")
    Call<DataModel> getData();

}
