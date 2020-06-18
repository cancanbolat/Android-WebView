package com.example.retrofitcomments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.retrofitcomments.Models.Result;
import com.example.retrofitcomments.RestApi.Manager_All;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {

    String id, postId;
    TextView id2, postId2, name, email, body;
    List<Result> result_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        define();
        get();
        request();
    }

    public void define() {
        id2 = findViewById(R.id.id2);
        postId2 = findViewById(R.id.postId2);
        name = findViewById(R.id.name2);
        email = findViewById(R.id.email2);
        body = findViewById(R.id.body2);
    }

    public void assigment(List<Result> list2) {
        id2.setText("" + result_list.get(0).getId());
        postId2.setText("" + result_list.get(0).getPostId());
        name.setText(result_list.get(0).getName());
        email.setText(result_list.get(0).getEmail());
        body.setText(result_list.get(0).getBody());
    }

    public void get() {
        Bundle bundle = getIntent().getExtras();
        id = bundle.getString("id");
        postId = bundle.getString("post_id");
    }

    public void request() {
        result_list = new ArrayList<>();
        Call<List<Result>> call = Manager_All.getOurInstance().getResult1(postId, id);
        call.enqueue(new Callback<List<Result>>() {
            @Override
            public void onResponse(Call<List<Result>> call, Response<List<Result>> response) {
                if (response.isSuccessful()) {
                    result_list = response.body();
                    assigment(result_list);
                }
            }

            @Override
            public void onFailure(Call<List<Result>> call, Throwable t) {

            }
        });
    }

}