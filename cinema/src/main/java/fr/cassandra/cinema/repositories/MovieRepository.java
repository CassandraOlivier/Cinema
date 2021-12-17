package fr.cassandra.cinema.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.cassandra.cinema.models.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

	List<Movie> findBySession_Id(String id);

}
