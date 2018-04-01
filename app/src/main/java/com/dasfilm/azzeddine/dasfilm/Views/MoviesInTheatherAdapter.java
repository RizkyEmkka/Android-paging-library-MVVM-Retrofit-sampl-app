package com.dasfilm.azzeddine.dasfilm.Views;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dasfilm.azzeddine.dasfilm.Entities.Movie;
import com.dasfilm.azzeddine.dasfilm.R;

/**
 * Created by azeddine on 3/31/18.
 */

public class MoviesInTheatherAdapter extends PagedListAdapter<Movie,RecyclerView.ViewHolder> {
    private static final String TAG = "MoviesInTheatherAdapter";

    public MoviesInTheatherAdapter() {
        super(Movie.DIFF_CALL);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return  new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Object ob = getItem(position);
        Log.d(TAG, "onBindViewHolder: ");
        if (ob instanceof Movie){
            Movie movie = (Movie) ob;
            ((MovieViewHolder) holder).textView.setText(movie.getTitle());
        };



    }

    private static class MovieViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public MovieViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.movie_title);
        }
    }
}
