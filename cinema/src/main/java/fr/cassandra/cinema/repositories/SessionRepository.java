package fr.cassandra.cinema.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.cassandra.cinema.models.Session;

public interface SessionRepository extends MongoRepository<Session, String>{

	List<Session> findByRoom_Id(String id);

}
