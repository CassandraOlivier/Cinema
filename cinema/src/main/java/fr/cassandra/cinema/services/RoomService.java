package fr.cassandra.cinema.services;

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

}
