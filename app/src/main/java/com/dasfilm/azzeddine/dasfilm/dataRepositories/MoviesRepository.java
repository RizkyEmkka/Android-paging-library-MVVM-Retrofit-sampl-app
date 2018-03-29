package com.dasfilm.azzeddine.dasfilm.dataRepositories;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.dasfilm.azzeddine.dasfilm.APIUtils.ServiceGenerator;
import com.dasfilm.azzeddine.dasfilm.Entities.Movie;
import com.dasfilm.azzeddine.dasfilm.dataModels.TMDBWebService;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by azeddine on 3/27/18.
 */

public class MoviesRepository {
    private static final String TAG = "MoviesRepository";

    private static TMDBWebService tmdbWebService = ServiceGenerator.createService(TMDBWebService.class);
    private static MoviesRepository moviesRepositoryInstance = new MoviesRepository();

    private MoviesRepository() {}

    public static MoviesRepository getInstance(){
        return moviesRepositoryInstance;
    }

    public LiveData<List<Movie>> getMoviesInTheater(int pageNumber){
        final MutableLiveData<List<Movie>> moviesInTheater = new MutableLiveData<>();
        tmdbWebService.getMoviesInTheater(pageNumber).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Gson gson = new Gson();
                JSONArray results;
                List<Movie> resultList;
               if(response.isSuccessful()){
                   if(response.body()!= null){
                       try {
                           results = new JSONObject(response.body().string()).getJSONArray("results");
                           resultList=  gson.fromJson(results.toString(), List.class);
                           moviesInTheater.setValue(resultList);
                       } catch (IOException | JSONException e) {
                           e.printStackTrace();
                       }
                   }
               }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure: ");

            }
        });
        return  moviesInTheater;
    }

}
