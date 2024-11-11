package com.dev.rudra.service;

import com.dev.rudra.dto.RoomDTO;
import com.dev.rudra.errorhandler.NoRoomFoundException;

import java.util.List;

public interface RoomService {

    RoomDTO getRoomById(Long id) throws NoRoomFoundException;
    List<RoomDTO> getRooms();
    RoomDTO createRoom(RoomDTO roomDTO);
    RoomDTO updateRoom(RoomDTO roomDTO) throws NoRoomFoundException;
    void deleteRoom(Long id);

}
