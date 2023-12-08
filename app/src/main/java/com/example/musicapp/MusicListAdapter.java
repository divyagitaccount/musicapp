package com.example.musicapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.ViewHolder> {

    private final ArrayList<AudioModal> songsList;
    private final LayoutInflater inflater;

    public MusicListAdapter(ArrayList<AudioModal> songsList, android.content.Context context) {
        this.songsList = songsList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycle_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AudioModal currentSong = songsList.get(position);
        holder.songtitle.setText(currentSong.getTitle());
        // Set other data or actions related to the view
    }

    @Override
    public int getItemCount() {
        return songsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView songtitle;
        ImageView icon1;

        public ViewHolder(View itemView) {
            super(itemView);
            songtitle = itemView.findViewById(R.id.textView);
            icon1 = itemView.findViewById(R.id.imageView);
        }
    }
}
