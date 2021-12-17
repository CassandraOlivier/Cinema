package fr.cassandra.cinema.services;

import java.util.List;

import fr.cassandra.cinema.models.Session;
import fr.cassandra.cinema.repositories.SessionRepository;

public class SessionService {
	
	private SessionRepository sessionRepository;

	public SessionService(SessionRepository sessionRepository) {
		this.sessionRepository = sessionRepository;
	}

	public Session save(Session session) {
		return this.sessionRepository.save(session);
	}

	public List<Session> findAll() {
		return this.sessionRepository.findAll();
	}
	
	
	
	
}
