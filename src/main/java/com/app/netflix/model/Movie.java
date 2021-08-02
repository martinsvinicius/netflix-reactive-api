package com.app.netflix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Movie {

    @Id
    private String id;

    private String movieName;
    private String movieType;
    private String principalActor;
    private Integer created_at;

    public Movie(final String id, final String movieName, final String movieType, final String principalActor, final Integer created_at) {
        this.id = id;
        this.movieName = movieName;
        this.movieType = movieType;
        this.principalActor = principalActor;
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getPrincipalActor() {
        return principalActor;
    }

    public void setPrincipalActor(String principalActor) {
        this.principalActor = principalActor;
    }

    public Integer getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Integer created_at) {
        this.created_at = created_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) && Objects.equals(movieName, movie.movieName) && Objects.equals(movieType, movie.movieType) && Objects.equals(principalActor, movie.principalActor) && Objects.equals(created_at, movie.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, movieName, movieType, principalActor, created_at);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieType='" + movieType + '\'' +
                ", principalActor='" + principalActor + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
