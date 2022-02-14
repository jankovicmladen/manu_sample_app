package com.example.menusampleapp.ui.main.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menusampleapp.R;
import com.example.menusampleapp.data.model.Venue;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<Venue> list;
    private OnItemClickListener onItemClickListener;

    public ListAdapter(List<Venue> list, OnItemClickListener onItemClickListener) {
        this.list = list;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Venue venue = list.get(position);
        holder.tvName.setText(venue.getVenue().getName());
        holder.itemView.setOnClickListener(view -> onItemClickListener.onItemClick(position, venue));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addAll(List<Venue> list, boolean clean){
        if (clean)
            this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);


        }
    }

    interface OnItemClickListener{
        public void onItemClick(int position, Venue venue);
    }
}
