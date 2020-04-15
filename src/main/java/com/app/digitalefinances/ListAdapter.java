package com.app.digitalefinances;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends  RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private ArrayList<String> dataset;
    private Context ctxt;
    public ListAdapter(Context context, ArrayList<String> data){
        dataset = data;
        ctxt = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        ImageView img;
        public ViewHolder(View v) {
            super(v);
            img = v.findViewById(R.id.imageView);
        }
    }


    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
