package songnan.bao.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import songnan.bao.demo.entity.Room;
import songnan.bao.demo.resposiitory.RoomRepo;

import java.util.List;

@Service
public class RoomService {
    private static final Logger LOG = LogManager.getLogger(RoomService.class);

    @Autowired
    private RoomRepo roomRepo;

    public Room getById(int id) {
        try {
            return roomRepo.findById(id).get();
        } catch (Exception e) {
            LOG.error(e.getMessage() + ". Invalid room ID: " + id);
        }
        return null;
    }

    public List<Room> getAll() {
        return roomRepo.findAll();
    }

    public Room save(Room room) {
        return roomRepo.save(room);
    }

    public void removeById(int id) {
        roomRepo.delete(getById(id));
    }
}
