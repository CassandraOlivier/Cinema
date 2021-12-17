package fr.cassandra.cinema.services;

import java.util.List;

import fr.cassandra.cinema.models.Movie;
import fr.cassandra.cinema.repositories.MovieRepository;

public class MovieService {

	private MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public Movie save(Movie movie) {
		return this.movieRepository.save(movie);
	}

	public List<Movie> findAll() {
		return this.movieRepository.findAll();
	}
	
	
}
