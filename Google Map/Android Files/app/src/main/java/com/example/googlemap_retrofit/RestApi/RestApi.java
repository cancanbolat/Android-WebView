package com.example.googlemap_retrofit.RestApi;

import com.example.googlemap_retrofit.MapJson;

import retrofit2.Call;
import retrofit2.http.GET;


public interface RestApi {

    // map.php
    @GET("map.php")
    Call<MapJson> map_infos();


}
