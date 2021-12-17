package fr.cassandra.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.cassandra.cinema.models.MovieTheater;

public interface MovieTheaterRepository extends MongoRepository<MovieTheater, String>{

}
