package com.app.netflix.repository;

import com.app.netflix.model.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface NetflixRepository extends ReactiveMongoRepository<Movie, String> {

}
