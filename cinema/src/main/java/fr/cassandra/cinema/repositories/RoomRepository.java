package fr.cassandra.cinema.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.cassandra.cinema.models.Room;

public interface RoomRepository extends MongoRepository<Room, String>{

	List<Room> findByMovieTheater_Id(String id);

}
