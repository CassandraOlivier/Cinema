package fr.cassandra.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.cassandra.cinema.models.Room;

public interface RoomRepository extends MongoRepository<Room, String>{

}
