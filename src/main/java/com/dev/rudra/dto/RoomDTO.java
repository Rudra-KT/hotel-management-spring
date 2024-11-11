package com.dev.rudra.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class RoomDTO {

    private String roomNumber;
    private String roomType;
    private BigDecimal roomPrice;
    private Integer roomCapacity;
    private Boolean isAvailable;
    @Builder.Default
    private Boolean breakfast = false;

}
