package com.example.retrofitcomments.RestApi;

import com.example.retrofitcomments.Models.Infos;
import com.example.retrofitcomments.Models.Result;

import java.util.List;

import retrofit2.Call;

public class Manager_All extends Base_Manager {

    private static Manager_All ourInstance = new Manager_All();

    public static synchronized Manager_All getOurInstance(){
        return ourInstance;
    }

    public Call<List<Infos>> getCall(){
        Call<List<Infos>> x = getRest_Api().getInfos();
        return x;
    }

    public Call<List<Result>> getResult1 (String post, String id){
        Call<List<Result>> y = getRest_Api().getResult(post, id);
        return y;
    }

}
