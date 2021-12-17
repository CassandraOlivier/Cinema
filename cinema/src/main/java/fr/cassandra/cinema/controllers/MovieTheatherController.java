package fr.cassandra.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cassandra.cinema.models.MovieTheater;
import fr.cassandra.cinema.services.MovieTheaterService;

@RestController
@RequestMapping("/cinemas")
public class MovieTheatherController {

	private MovieTheaterService service;

	public MovieTheatherController(MovieTheaterService service) {
		this.service = service;
	}
	
	@PostMapping
	public MovieTheater createMovieTheater(@RequestBody MovieTheater movieTheater) {
		return this.service.save(movieTheater);
	}
	
	@GetMapping
	public List<MovieTheater> getMovieTheaters() {
		return this.service.findAll();	
	}
	
	@PutMapping
	public MovieTheater updateMovieTheater(@RequestBody MovieTheater movieTheater) {
		return this.service.save(movieTheater);
	}
	
}
