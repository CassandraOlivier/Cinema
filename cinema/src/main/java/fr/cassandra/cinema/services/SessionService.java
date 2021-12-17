package fr.cassandra.cinema.services;

import java.util.List;
import java.util.Optional;

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


	public Optional<Session> findById(String id) {
		return this.sessionRepository.findById(id);
	}

	public void delete(Session session) {
		this.sessionRepository.delete(session);
	}

	public List<Session> findSessionsByRoomId(String id) {
		return this.sessionRepository.findByRoom_Id(id);
	}
	
	
	
	
}
