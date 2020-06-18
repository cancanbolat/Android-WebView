package com.example.retrofitcomments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.retrofitcomments.Adapters.Infos_Adapter;
import com.example.retrofitcomments.Models.Infos;
import com.example.retrofitcomments.RestApi.Manager_All;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Infos_Adapter infos_adapter;
    List<Infos> getInfos;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        define();
        request();
    }

    public void define() {
        listView = findViewById(R.id.list_view);
    }

    public void request() {
        getInfos = new ArrayList<>();

        Call<List<Infos>> call = Manager_All.getOurInstance().getCall();

        call.enqueue(new Callback<List<Infos>>() {
            @Override
            public void onResponse(Call<List<Infos>> call, Response<List<Infos>> response) {
                if (response.isSuccessful()) {
                    getInfos = response.body();
                    infos_adapter = new Infos_Adapter(getInfos, getApplicationContext(),MainActivity.this);
                    listView.setAdapter(infos_adapter);
                }
            }

            @Override
            public void onFailure(Call<List<Infos>> call, Throwable t) {

            }
        });
    }

}