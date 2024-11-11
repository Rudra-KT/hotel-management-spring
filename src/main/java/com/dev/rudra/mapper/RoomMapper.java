package com.dev.rudra.mapper;

import com.dev.rudra.dto.RoomDTO;
import com.dev.rudra.entity.Room;
import com.dev.rudra.entity.constant.RoomType;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    public RoomDTO roomToRoomDTO(Room room) {
        return RoomDTO.builder()
                .roomNumber(room.getRoomNumber())
                .roomCapacity(room.getRoomCapacity())
                .roomType(room.getRoomType().name())
                .roomPrice(room.getRoomPrice())
                .isAvailable(room.getIsAvailable())
                .breakfast(room.getIsBreakfastIncluded())
                .build();
    }

    public Room roomDTOToRoom(RoomDTO roomDTO) {
        Room room = Room.builder()
                .roomNumber(roomDTO.getRoomNumber())
                .roomCapacity(roomDTO.getRoomCapacity())
                .roomType(RoomType.valueOf(roomDTO.getRoomType()))
                .roomPrice(roomDTO.getRoomPrice())
                .isAvailable(roomDTO.getIsAvailable())
                .build();
        if (roomDTO.getBreakfast() != null && !roomDTO.getBreakfast()) room.setIsBreakfastIncluded(true);
        return room;
    }

}
