package fr.cassandra.cinema.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cassandra.cinema.models.Room;
import fr.cassandra.cinema.models.Session;
import fr.cassandra.cinema.services.SessionService;

@RestController
@RequestMapping("/seances")
public class SessionController {

	private SessionService	sessionService;
	
	
	public SessionController(SessionService sessionService) {
		this.sessionService = sessionService;
	}


	@PostMapping
	public Session createSession(@RequestBody Session session) {
		return this.sessionService.save(session);
	}
	
	@GetMapping("seance/{id}")
	public Optional<Session> getSession(@PathVariable String id) {
		return this.sessionService.findById(id);
	}
	
	@GetMapping
	public List<Session> getSessions() {
		return this.sessionService.findAll();
	}
	
	@PutMapping
	public Session updateSession(@RequestBody Session session) {
		return this.sessionService.save(session);
	}
	
	@DeleteMapping
	public void deleteSession(@RequestBody Session session) {
		this.sessionService.delete(session);
	}
}
