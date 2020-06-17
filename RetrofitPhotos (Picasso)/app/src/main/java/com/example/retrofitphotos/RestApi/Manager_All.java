package com.example.retrofitphotos.RestApi;

import com.example.retrofitphotos.Models.Infos;

import java.util.List;

import retrofit2.Call;

public class Manager_All extends Base_Manager {

    private static Manager_All ourgetInstance = new Manager_All();

    public static synchronized Manager_All getInstance(){
        return ourgetInstance;
    }

    public Call<List<Infos>> getInfos(){
        Call<List<Infos>> x = getRestApiClient().getir();
        return x;
    }

}
