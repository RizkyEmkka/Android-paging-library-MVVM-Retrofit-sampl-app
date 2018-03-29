package com.dasfilm.azzeddine.dasfilm.Entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * Created by azeddine on 3/27/18.
 */

public class Movie {
    private int id;
    private int imdbId;
    private String originalTitle;
    private Date runTime;
    private String status;
    @SerializedName("tagline")
    private String tagLine;
    private Date releaseDate;
    private String directorFullName;
    private String writerFullName;
    private int reviewsRate;
    private List<String> genres;
    private String overview;
    private float popularity;
    private String youtubeTrailerKey;
    @SerializedName("backdrop_path")
    private String backdropImagePath;
    private List<String> videosPath;
    private List<Review> reviews;
    private List<Actor> actors;

    public Movie(int id, String originalTitle, List<String> genres) {
        this.id = id;
        this.originalTitle = originalTitle;
        this.genres = genres;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImdbId() {
        return imdbId;
    }

    public void setImdbId(int imdbId) {
        this.imdbId = imdbId;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Date getRunTime() {
        return runTime;
    }

    public void setRunTime(Date runTime) {
        this.runTime = runTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirectorFullName() {
        return directorFullName;
    }

    public void setDirectorFullName(String directorFullName) {
        this.directorFullName = directorFullName;
    }

    public String getWriterFullName() {
        return writerFullName;
    }

    public void setWriterFullName(String writerFullName) {
        this.writerFullName = writerFullName;
    }

    public int getReviewsRate() {
        return reviewsRate;
    }

    public void setReviewsRate(int reviewsRate) {
        this.reviewsRate = reviewsRate;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public String getYoutubeTrailerKey() {
        return youtubeTrailerKey;
    }

    public void setYoutubeTrailerKey(String youtubeTrailerKey) {
        this.youtubeTrailerKey = youtubeTrailerKey;
    }

    public String getBackdropImagePath() {
        return backdropImagePath;
    }

    public void setBackdropImagePath(String backdropImagePath) {
        this.backdropImagePath = backdropImagePath;
    }

    public CompactMovie getCompactMovie(){
        return new CompactMovie(id,originalTitle,imdbId, backdropImagePath,reviews.size(),reviewsRate,genres);
    }

    private class CompactMovie{
        private int id;
        private String originalTitle;
        private int imdbId;
        private String posterImagePath;
        private int reviewsNumber;
        private int reviewsRate;
        private List<String> genres;

        public CompactMovie(int id, String originalTitle, int imdbId, String posterImagePath, int reviewsNumber, int reviewsRate, List<String> genres) {
            this.id = id;
            this.originalTitle = originalTitle;
            this.imdbId = imdbId;
            this.posterImagePath = posterImagePath;
            this.reviewsNumber = reviewsNumber;
            this.reviewsRate = reviewsRate;
            this.genres = genres;
        }

        public int getId() {
            return id;
        }

        public String getOriginalTitle() {
            return originalTitle;
        }

        public int getImdbId() {
            return imdbId;
        }

        public String getPosterImagePath() {
            return posterImagePath;
        }

        public int getReviewsNumber() {
            return reviewsNumber;
        }

        public int getReviewsRate() {
            return reviewsRate;
        }

        public List<String> getGenres() {
            return genres;
        }
    }
}
