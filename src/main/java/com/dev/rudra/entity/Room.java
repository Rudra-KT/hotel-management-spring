package com.dev.rudra.entity;

import com.dev.rudra.entity.constant.RoomType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Room {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "room_no")
    private String roomNumber;
    @Column(name = "room_type")
    private RoomType roomType;
    @Column(name = "room_charges", precision = 10, scale = 2)
    private BigDecimal roomPrice;
    @Column(name = "no_of_beds")
    private Integer roomCapacity;
    @Column(name = "is_available", nullable = false)
    private Boolean isAvailable;
    @Column(name = "is_breakfast", nullable = false)
    @Builder.Default
    private Boolean isBreakfastIncluded = false;
    @ManyToOne
    private Hotel hotel;

}
