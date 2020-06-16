package com.example.retrofitapp.RestApi;

import com.example.retrofitapp.Models.Infos;

import java.util.List;

import retrofit2.Call;

public class Manager_All extends Base_Manager {

    private static Manager_All ourInstanse = new Manager_All();

    public static synchronized Manager_All getOurInstanse (){
        return ourInstanse;
    }

    public Call<List<Infos>> getInfos (){
        Call<List<Infos>> x = getRestApiClient().get_infos();
        return x;
    }

}
