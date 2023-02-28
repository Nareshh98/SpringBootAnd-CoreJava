package com.springMvc.model;

public class Movie {

    String movieName;    
    String movieActor;

    Movie(){

     }    
   public Movie(String movieName, String movieActor) {
        super();
        this.movieName = movieName;
        this.movieActor = movieActor;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieActor() {
        return movieActor;
    }
    public void setMovieActor(String movieActor) {
        this.movieActor = movieActor;
    }
  
    
  
}

