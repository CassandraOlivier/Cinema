package fr.cassandra.cinema.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.cassandra.cinema.repositories.MovieTheaterRepository;
import fr.cassandra.cinema.services.MovieTheaterService;

@Configuration
public class MovieTheaterConfiguration {
	@Bean
	public MovieTheaterService movieTheatherService(MovieTheaterRepository repository) {
		return new MovieTheaterService(repository);
	}
}
