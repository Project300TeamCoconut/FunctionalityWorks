package com.project300.movieswipe;

public class MatchesObject {

    private String MovieName;

    private String MovieImage;
    public MatchesObject(String moveiname){
        this.MovieName = moveiname;
       // this.MovieImage = movieImage;

    }


    public String getMovieName()
    {return MovieName; }

    public void setMovieName(String movieName)
    {this.MovieName = movieName;}

    public String getMovieImage()
    {return MovieImage; }

    public void setMovieImage(String movieImage)
    {this.MovieImage = movieImage;}



}
