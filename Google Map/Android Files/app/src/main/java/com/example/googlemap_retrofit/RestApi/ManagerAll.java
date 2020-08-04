package com.example.googlemap_retrofit.RestApi;


import com.example.googlemap_retrofit.MapJson;

import retrofit2.Call;

public class ManagerAll extends BaseManager {

    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getOurInstance() {
        return ourInstance;
    }

    // map infos
    public Call<MapJson> getMapInfo() {
        Call<MapJson> x = getRestApi().map_infos();
        return x;
    }

}
