package com.example.retrofitphotos.RestApi;

import com.example.retrofitphotos.Models.Infos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Rest_Api {

    @GET("/photos")
    Call<List<Infos>> getir();

}
