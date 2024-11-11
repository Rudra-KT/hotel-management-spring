package com.dev.rudra.repository;

import com.dev.rudra.entity.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    @Query("SELECT r FROM Room r")
    List<Room> findAllRooms();

    Optional<Room> findByRoomNumber(String roomNumber);
}
