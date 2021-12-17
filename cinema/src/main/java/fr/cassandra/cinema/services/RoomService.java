package fr.cassandra.cinema.services;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;

import fr.cassandra.cinema.models.Room;
import fr.cassandra.cinema.repositories.RoomRepository;

public class RoomService {
	
	private RoomRepository roomRepository;

	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	public Room save(Room room) {
		return this.roomRepository.save(room);
	}

	public List<Room> findAll() {
		return this.roomRepository.findAll();
	}

	public void delete(Room room) {
		this.roomRepository.delete(room);
	}

	public List<Room> findRoomsByMovieTheaterId(String id) {
		return this.roomRepository.findByMovieTheater_Id(id);
	}
	
	@GetMapping("salle/{id}")
	public Optional<Room> findById(String id) {
		return this.roomRepository.findById(id);
	}
}
