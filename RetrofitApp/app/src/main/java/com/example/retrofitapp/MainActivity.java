package com.example.retrofitapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.retrofitapp.Adapters.InfoAdapter;
import com.example.retrofitapp.Models.Infos;
import com.example.retrofitapp.RestApi.Manager_All;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Infos> infos;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        istek();
    }

    public void tanimla(){
        listView = findViewById(R.id.list_view);
    }

    public void istek(){

        infos = new ArrayList<>();

         Call<List<Infos>> listCall = Manager_All.getOurInstanse().getInfos();
         listCall.enqueue(new Callback<List<Infos>>() {
             @Override
             public void onResponse(Call<List<Infos>> call, Response<List<Infos>> response) {
                 if (response.isSuccessful()){
                     infos =  response.body();
                     InfoAdapter infoAdapter = new InfoAdapter(infos,getApplicationContext());
                     listView.setAdapter(infoAdapter);
                 }
             }

             @Override
             public void onFailure(Call<List<Infos>> call, Throwable throwable) {

             }
         });
    }

}
