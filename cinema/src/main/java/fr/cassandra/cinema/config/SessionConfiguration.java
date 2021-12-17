package fr.cassandra.cinema.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.cassandra.cinema.repositories.SessionRepository;
import fr.cassandra.cinema.services.SessionService;

@Configuration
public class SessionConfiguration {
	
	@Bean
	public SessionService sessionService(SessionRepository sessionRepository) {
			return new SessionService(sessionRepository);
	}
}
