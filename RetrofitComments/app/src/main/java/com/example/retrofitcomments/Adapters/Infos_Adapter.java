package com.example.retrofitcomments.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.icu.text.IDNA;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.retrofitcomments.MainActivity2;
import com.example.retrofitcomments.Models.Infos;
import com.example.retrofitcomments.R;

import java.util.List;

public class Infos_Adapter extends BaseAdapter {

    List<Infos> myList;
    Context context;
    Activity activity;

    public Infos_Adapter(List<Infos> myList, Context context, Activity activity) {
        this.myList = myList;
        this.context = context;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);

        TextView postId, id, name, email, body;
        LinearLayout layoutList;

        layoutList = convertView.findViewById(R.id.layoutList);
        postId     = convertView.findViewById(R.id.postId);
        id         = convertView.findViewById(R.id.id);
        name       = convertView.findViewById(R.id.name);
        email      = convertView.findViewById(R.id.email);
        body       = convertView.findViewById(R.id.body);

        postId.setText(""+myList.get(position).getPostId());
        id.setText(""+myList.get(position).getId());
        name.setText(myList.get(position).getName());
        email.setText(myList.get(position).getEmail());
        body.setText(myList.get(position).getBody());

        final String post = ""+myList.get(position).getPostId();
        final String idm = ""+myList.get(position).getId();

        layoutList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, MainActivity2.class);
                intent.putExtra("post_id",post);
                intent.putExtra("id",idm);
                activity.startActivity(intent);
            }
        });

        return convertView;

    }
}
