package com.example.retrofitapp.RestApi;

public class Base_Manager {

    protected Rest_Api getRestApiClient(){
        RestApiClient restApiClient = new RestApiClient(Base_URL.url_info);
        return restApiClient.getRestApi();
    }

}
