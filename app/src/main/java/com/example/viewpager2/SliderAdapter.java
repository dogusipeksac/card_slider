package com.example.viewpager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.MyViewHolder> {


    List<Data> dataList;

    public SliderAdapter(List<Data> data) {
        dataList=data;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Data data=dataList.get(position);
        holder.ad.setText(data.getIsim());
        holder.soyad.setText(data.getSoyad());
        holder.yas.setText(data.getYas());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView ad;
        TextView soyad;
        TextView yas;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ad=itemView.findViewById(R.id.name);
            soyad=itemView.findViewById(R.id.surname);
            yas=itemView.findViewById(R.id.age);
        }
    }
}