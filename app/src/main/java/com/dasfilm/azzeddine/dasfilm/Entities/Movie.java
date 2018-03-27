package com.dasfilm.azzeddine.dasfilm.Entities;

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
    private String tagLine;
    private Date releaseDate;
    private String directorFullName;
    private String writerFullName;
    private int reviewsRate;
    private List<String> genres;
    private String overview;
    private float popularity;
    private String youtubeTrailerKey;
    private String posterImagePath;
    private List<Review> reviews;

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

    public String getPosterImagePath() {
        return posterImagePath;
    }

    public void setPosterImagePath(String posterImagePath) {
        this.posterImagePath = posterImagePath;
    }
}
