package fr.cassandra.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping
	public List<Session> getSessions() {
		return this.sessionService.findAll();
	}
}
