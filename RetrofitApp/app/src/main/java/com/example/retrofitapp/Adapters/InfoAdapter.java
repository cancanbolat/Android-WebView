package com.example.retrofitapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.retrofitapp.Models.Infos;
import com.example.retrofitapp.R;

import java.util.List;

public class InfoAdapter extends BaseAdapter {

    List<Infos> infosList;
    Context context;

    public InfoAdapter(List<Infos> infosList, Context context) {
        this.infosList = infosList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return infosList.size();
    }

    @Override
    public Object getItem(int position) {
        return infosList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);

        TextView userId = convertView.findViewById(R.id.userId);
        TextView id = convertView.findViewById(R.id.id);
        TextView title = convertView.findViewById(R.id.gelen_title);
        CheckBox completedCheckBox = convertView.findViewById(R.id.completed);

        userId.setText(userId.getText()+" "+infosList.get(position).getUserId());
        id.setText(id.getText()+" "+infosList.get(position).getId());
        title.setText(title.getText()+" "+infosList.get(position).getTitle());

        Boolean deger = infosList.get(position).getCompleted();
        if (deger == true){
            completedCheckBox.setChecked(true);
        }else {
            completedCheckBox.setChecked(false);
        }

        return convertView;
    }
}
