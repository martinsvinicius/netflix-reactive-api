package com.app.netflix;

import com.app.netflix.model.Movie;
import com.app.netflix.repository.NetflixRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class NetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixApplication.class, args);
	}

	@Bean
	CommandLineRunner init (ReactiveMongoOperations operations, NetflixRepository repository) {
		return args -> {
			Flux<Movie> movieFlux  = Flux.just(
					new Movie(null, "Matrix", "Acao", "Keanu Reeves", 1995),
					new Movie(null, "Diario de uma paixao", "Romance", "Ryan Gosling", 2003),
					new Movie(null, "Uma noite de crime", "Suspense", null, 1995),
					new Movie(null, "Jogos Mortais", "Terror", null, 1995),
					new Movie(null, "1907", "Drama", "George MacKay", 2020))

					.flatMap(repository::save);

					movieFlux
							.thenMany(repository.findAll())
							.subscribe(System.out::println);
		};
	}
}
