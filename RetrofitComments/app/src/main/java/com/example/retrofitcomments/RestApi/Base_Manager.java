package com.example.retrofitcomments.RestApi;

public class Base_Manager {

    protected Rest_Api getRest_Api(){
        RestApiClient restApiClient = new RestApiClient(Base_URL.base_url);
        return restApiClient.getRestApi();
    }

}
