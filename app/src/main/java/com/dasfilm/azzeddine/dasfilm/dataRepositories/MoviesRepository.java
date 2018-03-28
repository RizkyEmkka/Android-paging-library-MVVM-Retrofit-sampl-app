package com.dasfilm.azzeddine.dasfilm.dataRepositories;

import com.dasfilm.azzeddine.dasfilm.APIUtils.ServiceGenerator;
import com.dasfilm.azzeddine.dasfilm.dataModels.TMDBWebService;

/**
 * Created by azeddine on 3/27/18.
 */

public class MoviesRepository {
    private TMDBWebService tmdbWebService = ServiceGenerator.createService(TMDBWebService.class);

    private static MoviesRepository moviesRepositoryInstance = new MoviesRepository();
    private MoviesRepository() {}



}
