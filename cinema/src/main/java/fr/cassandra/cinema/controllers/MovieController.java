package fr.cassandra.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cassandra.cinema.models.Movie;
import fr.cassandra.cinema.services.MovieService;

@RestController
@RequestMapping("/films")
public class MovieController {

	private MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@PostMapping
	public Movie createMovie(@RequestBody Movie movie) {
		return this.movieService.save(movie);
	}
	
	@GetMapping
	public List<Movie> getMovies() {
		return this.movieService.findAll();
	}
	
	
}
