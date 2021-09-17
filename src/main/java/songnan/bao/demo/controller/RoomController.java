package songnan.bao.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import songnan.bao.demo.entity.Room;
import songnan.bao.demo.service.RoomService;

@Api(tags="Room Management")
@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @ApiOperation("Get all Rooms")
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllRooms() {
        return ResponseEntity.ok().body(roomService.getAll());
    }

    @ApiOperation("Get one Room by ID")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getRoomById(@PathVariable int id) {
        return ResponseEntity.ok().body(roomService.getById(id));
    }

    @ApiOperation("Save or update one Room by JSON input")
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody Room room) {
        return ResponseEntity.ok().body(roomService.save(room));
    }
}
