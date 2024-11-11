package com.dev.rudra.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class StaffDTO {

    private String firstName;
    private String lastName;
    private String position;
    private BigDecimal salary;
    private String dateOfBirth;
    private String phone;
    private String email;

}
