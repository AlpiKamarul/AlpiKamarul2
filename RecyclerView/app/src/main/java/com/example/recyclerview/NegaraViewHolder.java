package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class NegaraViewHolder extends ViewHolder {
    public ImageView imageView1;
    public TextView namaTextView, deskripsiTextView;

    public NegaraViewHolder(@NonNull View itemView){
        super(itemView);

        imageView1 = (ImageView)itemView.findViewById(R.id.imageView);
        namaTextView = (TextView)itemView.findViewById(R.id.namaTextView);
        deskripsiTextView = (TextView)itemView.findViewById(R.id.deskripsitextView);
    }
    @NonNull
    @Override
    public NegaraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_negara, parent,  false);

        return new NegaraViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull NegaraViewHolder holder, int position){
        NegaraModel nm = NegaraModelList.get(position);

        Picasso.with(c).load(nm.getUrl()).into(holder.imageView1);
        holder.namaTextView.setText(nm.getNama());
        holder.deskripsiTextView.setText(nm.getDeskripsi());
    }
    @Override
    public int getItemCount(){
        return (NegaraModelList != null) ? NegaraModelList.size() : 0;
    }
}
