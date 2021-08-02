package com.app.netflix.model;

import java.util.Objects;

public class MovieEvent {

    private Long movieId;
    private String eventType;

    public MovieEvent() {}

    public MovieEvent(final Long movieId, final String eventType) {
        this.movieId = movieId;
        this.eventType = eventType;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieEvent that = (MovieEvent) o;
        return Objects.equals(movieId, that.movieId) && Objects.equals(eventType, that.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, eventType);
    }

    @Override
    public String toString() {
        return "MovieEvent{" +
                "movieId=" + movieId +
                ", eventType='" + eventType + '\'' +
                '}';
    }
}
