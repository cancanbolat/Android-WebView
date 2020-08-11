package com.example.volleyjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Viewholder> {

    ImageView item_image;
    TextView item_desc, item_title;

    List<MyModel> myModelList;
    Context context;

    public MyAdapter(List<MyModel> myModelList, Context context) {
        this.myModelList = myModelList;
        this.context = context;
    }

    @Override
    public MyAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new MyAdapter.Viewholder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.Viewholder holder, int position) {
        item_title.setText(myModelList.get(position).getTitle());
        item_desc.setText(myModelList.get(position).getArtist());
        Picasso.get().load(myModelList.get(position).getCoverImage()).into(item_image);
    }

    @Override
    public int getItemCount() {
        return myModelList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(View itemView) {
            super(itemView);
            item_image = itemView.findViewById(R.id.item_image);
            item_desc = itemView.findViewById(R.id.item_desc);
            item_title = itemView.findViewById(R.id.item_title);
        }
    }
}
