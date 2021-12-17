package fr.cassandra.cinema.controllers;

import org.springframework.web.bind.annotation.PostMapping;
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

}
