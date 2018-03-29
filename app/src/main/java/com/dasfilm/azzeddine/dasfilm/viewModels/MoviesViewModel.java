package com.dasfilm.azzeddine.dasfilm.viewModels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.dasfilm.azzeddine.dasfilm.Entities.Movie;
import com.dasfilm.azzeddine.dasfilm.dataRepositories.MoviesRepository;

import java.util.List;

/**
 * Created by azeddine on 3/29/18.
 */

public class MoviesViewModel extends ViewModel {
    private static final String TAG = "MoviesViewModel";
    private MoviesRepository mMoviesRepository;

    private LiveData<List<Movie>> mMoviesInTheaterList;
    private int mMoviesInTheaterPageNumber = 1;


    public MoviesViewModel() {
        this.mMoviesRepository = MoviesRepository.getInstance();
    }

    public LiveData<List<Movie>> getMoviesInTheater(){
        if(mMoviesInTheaterList == null){
            mMoviesInTheaterList = mMoviesRepository.getMoviesInTheater(mMoviesInTheaterPageNumber);
        }
        return mMoviesInTheaterList;
    }
}
