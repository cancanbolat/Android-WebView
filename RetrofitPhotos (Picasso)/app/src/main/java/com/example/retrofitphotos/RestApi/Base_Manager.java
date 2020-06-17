package com.example.retrofitphotos.RestApi;

public class Base_Manager {

    protected Rest_Api getRestApiClient(){
        RestApiClient restApiClient = new RestApiClient(Base_URL.base_url);
        return restApiClient.getRestApi();
    }

}
