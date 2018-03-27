package com.dasfilm.azzeddine.dasfilm.dataModels;

import com.dasfilm.azzeddine.dasfilm.Entities.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

/**
 * Created by azeddine on 3/27/18.
 */

public interface TMDBWebService {

    /**
     * Get a list of movies in theatres.
     */
    @GET("movie/now_playing")
    Call<Void> getMoviesInTheather();


    /**
     * Get a list of upcoming movies in theatres.
     */

    @GET("movie/upcoming")
    Call<Void> getUpcomingMovies();

    /**
     * Get the most newly created movie.
     */
    @GET("movie/latest")
    Call<Void> getLatestMovies();

    /**
     * Get the primary information about a movie.
     */
    @GET("movie/{movie_id}")
    Call<Void> getMovieDetailsById(@Path("movie_id") int id);

    /**
     * Get the cast and crew for a movie.
     */
    @GET("movie/{movie_id}/credits")
    Call<Void> getMovieCredits(@Path("movie_id") int id);
    /**
     * Get the videos that have been added to a movie.
     */
    @GET("movie/{movie_id}/videos")
    Call<Void> getMovieVideo(@Path("movie_id") int id);

    /**
     * Get a list of the current popular movies on TMDb.
     */
    @GET("movie/popular")
    Call<Void> getPopularMovies();

    /**
     * Get the top rated movies on TMDb.
     */
    @GET("movie/top_rated")
    Call<Void> getTopRatedMovies();

    /**
     * Get the user reviews for a movie.
     */
    @GET("movie/{movie_id}/reviews")
    Call<Void> getMovieUserReview(@Path("movie_id") int id);

    /**
     * Get the primary person details by id.
     */
    @GET("person/{person_id}")
    Call<Void> getPersonDetailsById(@Path("person_id") int id);

    /**
     * Get the movie credits for a person.
     */
    @GET("person/{person_id}/movie_credits")
    Call<Void> getPersonMovieCredits(@Path("person_id") int id);

    /**
     * Get the images that this person has been tagged in.
     */
    @GET("person/{person_id}/tagged_images")
    Call<Void> getPersonTaggedImages(@Path("person_id") int id);

}
