package fr.cassandra.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.cassandra.cinema.models.Session;

public interface SessionRepository extends MongoRepository<Session, String>{

}
