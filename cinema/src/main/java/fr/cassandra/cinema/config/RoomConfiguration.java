package fr.cassandra.cinema.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.cassandra.cinema.repositories.RoomRepository;
import fr.cassandra.cinema.services.RoomService;

@Configuration
public class RoomConfiguration {

	@Bean
	public RoomService roomService(RoomRepository roomRepository) {
			return new RoomService(roomRepository);
	}
}
