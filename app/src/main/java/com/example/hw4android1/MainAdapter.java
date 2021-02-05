package com.example.hw4android1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    public List<SaveInfo> list;
    public Context context;

    public MainAdapter(List<SaveInfo> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        SaveInfo text=list.get(position);
        holder.text.setText(text.getName());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.edText);
        }
    }
}
