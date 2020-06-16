package com.example.retrofitapp.RestApi;

import com.example.retrofitapp.Models.Infos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Rest_Api {

    @GET("/todos")
    Call<List<Infos>> get_infos();

}
