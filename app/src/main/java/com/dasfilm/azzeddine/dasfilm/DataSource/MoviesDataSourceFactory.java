package com.dasfilm.azzeddine.dasfilm.DataSource;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;
import android.arch.paging.PageKeyedDataSource;

import com.dasfilm.azzeddine.dasfilm.Entities.Movie;
import com.dasfilm.azzeddine.dasfilm.dataModels.TMDBWebService;

import java.util.concurrent.Executor;

/**
 * Created by azeddine on 3/31/18.
 */

public class MoviesDataSourceFactory extends DataSource.Factory<Long, Movie> {
    public static final int MOVIES_IN_THEATER_ID= 1;
    PageKeyedDataSource moviesDataSource;
    MutableLiveData<PageKeyedDataSource> mutableLiveData;
    Executor executor;
    TMDBWebService webService;
    int dataSourceId;

    public MoviesDataSourceFactory(Executor executor, TMDBWebService webService,int dataSourceId) {
      this.executor = executor;
      this.webService = webService;
      mutableLiveData = new MutableLiveData<>();
    }

    @Override
    public DataSource<Long, Movie> create() {
        switch (dataSourceId){
            case MOVIES_IN_THEATER_ID:
                moviesDataSource = new MoviesInTheaterDataSource(executor,webService);
                mutableLiveData.postValue(moviesDataSource);
                break;
        }
        return moviesDataSource;
    }

}
