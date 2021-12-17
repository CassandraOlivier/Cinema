package fr.cassandra.cinema.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.cassandra.cinema.repositories.MovieRepository;
import fr.cassandra.cinema.services.MovieService;

@Configuration
public class MovieConfiguration {
	@Bean
	public MovieService movieService(MovieRepository movieRepository) {
			return new MovieService(movieRepository);
	}
}
