package fr.cassandra.cinema.services;

import java.util.List;

import fr.cassandra.cinema.models.MovieTheater;
import fr.cassandra.cinema.repositories.MovieTheaterRepository;

public class MovieTheaterService {

	private MovieTheaterRepository repository;
	
	
	public MovieTheaterService(MovieTheaterRepository repository) {
		this.repository = repository;
	}


	public List<MovieTheater> findAll() {
		return this.repository.findAll();
	}


	public MovieTheater save(MovieTheater movieTheater) {
		return this.repository.save(movieTheater);
	}
	
	
	
}
