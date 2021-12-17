package fr.cassandra.cinema.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cassandra.cinema.models.Room;
import fr.cassandra.cinema.services.RoomService;

@RestController
@RequestMapping("/salles")
public class RoomController {
	
	private RoomService	roomService;
	
	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@PostMapping
	public Room createRoom(@RequestBody Room room) {
		return this.roomService.save(room);
	}
	
	@GetMapping
	public List<Room> getRooms() {
		return this.roomService.findAll();	
	}
	
	@GetMapping("room/{id}")
	public Optional<Room> getRoom(@PathVariable String id) {
		return this.roomService.findById(id);
	}
	
	@PutMapping
	public Room updateRoom(@RequestBody Room room) {
		return this.roomService.save(room);
	}
	
	@DeleteMapping
	public void deleteRoom(@RequestBody Room room) {
		this.roomService.delete(room);
	}
	
	@GetMapping("cinema/{id}")
	public List<Room> findRoomsByMovieTheaterId(@PathVariable String id) {
		return this.roomService.findRoomsByMovieTheaterId(id);
	}
}
