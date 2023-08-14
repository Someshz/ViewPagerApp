package com.example.viewpagerapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<Integer> imageArrayList;

    public MyAdapter(ArrayList<Integer> imageArrayList) {
        this.imageArrayList = imageArrayList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.image);
        }
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.image_page, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        int img = imageArrayList.get(position);
        holder.img.setImageResource(img);
    }

    @Override
    public int getItemCount() {
        return imageArrayList.size();
    }
}