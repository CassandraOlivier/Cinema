package fr.cassandra.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.cassandra.cinema.models.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

}
