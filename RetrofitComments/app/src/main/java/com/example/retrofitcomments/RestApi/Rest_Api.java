package com.example.retrofitcomments.RestApi;

import com.example.retrofitcomments.Models.Infos;
import com.example.retrofitcomments.Models.Result;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Rest_Api {

    @GET("/comments")
    Call<List<Infos>> getInfos();

    @GET("/comments") Call<List<Result>> getResult(@Query("postId") String postid, @Query("id") String id);

}
