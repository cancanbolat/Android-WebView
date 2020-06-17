package com.example.retrofitphotos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.retrofitphotos.Adapters.Infos_Adapter;
import com.example.retrofitphotos.Models.Infos;
import com.example.retrofitphotos.RestApi.Manager_All;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Infos> infoList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getListView();
        istek();
    }

    public void getListView() {
        listView = findViewById(R.id.list_view);
    }

    public void istek() {
        infoList = new ArrayList<>();

        //ProgressDialog progressDialog = new ProgressDialog(this);
        //progressDialog.setTitle("Information Display");
        //progressDialog.setMessage("Loading Content. Please Wait ...");
        //progressDialog.setCancelable(false);
        //progressDialog.show();

        Call<List<Infos>> service = Manager_All.getInstance().getInfos();
        service.enqueue(new Callback<List<Infos>>() {
            @Override
            public void onResponse(Call<List<Infos>> call, Response<List<Infos>> response) {
                if (response.isSuccessful()) {

                    infoList = response.body();
                    Infos_Adapter infos_adapter = new Infos_Adapter(infoList, getApplicationContext());
                    listView.setAdapter(infos_adapter);

                }
                //progressDialog.cancel();
            }

            @Override
            public void onFailure(Call<List<Infos>> call, Throwable t) {

            }
        });

    }


}