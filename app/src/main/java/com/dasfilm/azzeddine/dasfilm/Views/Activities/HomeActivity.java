package com.dasfilm.azzeddine.dasfilm.Views.Activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.dasfilm.azzeddine.dasfilm.Entities.Movie;
import com.dasfilm.azzeddine.dasfilm.R;
import com.dasfilm.azzeddine.dasfilm.Views.MoviesInTheatherAdapter;
import com.dasfilm.azzeddine.dasfilm.viewModels.MoviesInTheaterViewModel;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    private MoviesInTheaterViewModel mMoviesViewModel;
    private RecyclerView mRecyclerView;
    private MoviesInTheatherAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mRecyclerView = findViewById(R.id.list);

        adapter = new MoviesInTheatherAdapter();

        mMoviesViewModel = ViewModelProviders.of(this).get(MoviesInTheaterViewModel.class);
        mMoviesViewModel.getMoviesInTheaterList().observe(this, new Observer<PagedList<Movie>>() {
            @Override
            public void onChanged(@Nullable PagedList<Movie> movies) {
                Log.d(TAG, "onChanged: "+movies.size());
                adapter.submitList(movies);
            }
        });
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mRecyclerView.setAdapter(adapter);
    }
}
