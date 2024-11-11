package com.dev.rudra.controller;

import com.dev.rudra.dto.ResponseDTO;
import com.dev.rudra.dto.StaffDTO;
import com.dev.rudra.errorhandler.NoStaffFoundException;
import com.dev.rudra.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    @GetMapping
    public ResponseEntity<List<StaffDTO>> listStaffs() {
        List<StaffDTO> staffs = staffService.getAllStaff();
        return ResponseEntity.ok(staffs);
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> addStaff(@RequestBody StaffDTO staff) throws ParseException {
        ResponseDTO response = staffService.createStaff(staff);

        int responseCode = Integer.parseInt(response.getCode());
        return ResponseEntity.status(HttpStatus.valueOf(responseCode))
                .body(response);
    }

    @PutMapping
    public ResponseEntity<ResponseDTO> updateStaff(@RequestBody StaffDTO staff) throws ParseException, NoStaffFoundException {
        ResponseDTO response = staffService.updateStaff(staff);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{staffId}")
    public ResponseEntity<ResponseDTO> deleteStaff(@PathVariable("staffId") Long id) throws NoStaffFoundException {
        return ResponseEntity.ok(staffService.deleteStaff(id));
    }

    @GetMapping("/{staffId}")
    public ResponseEntity<StaffDTO> getStaffById(@PathVariable("staffId") Long id) throws NoStaffFoundException {
        StaffDTO response = staffService.getStaffById(id);
        return ResponseEntity.ok(response);
    }

}
