package fr.cassandra.cinema.services;

import java.util.List;
import java.util.Optional;

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


	public void delete(MovieTheater movieTheater) {
		this.repository.delete(movieTheater);;
	}


	public Optional<MovieTheater> findById(String id) {
		return this.repository.findById(id);
	}
	
	
	
}
