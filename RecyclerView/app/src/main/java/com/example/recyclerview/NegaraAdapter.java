package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recylerview.widget.RecylerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NegaraAdapter extends RecyclerView.Adapter<NegaraAdapter> {
    private Context c;
    private List<NegaraModel> negaraModelList;

    public NegaraAdapter(Context c, List<NegaraModel> negaraModelList){
        this.c = c;
        this.negaraModelList = negaraModelList;

    }
}
