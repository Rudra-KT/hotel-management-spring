package com.dev.rudra.controller;

import com.dev.rudra.errorhandler.NoRoomFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class RoomControllerAdvice {

    @ExceptionHandler(NoRoomFoundException.class)
    public ResponseEntity<Map<String, String>> handleNoRoomFound(NoRoomFoundException ex,
                                                                 HttpServletRequest request) {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("message", ex.getMessage());
        response.put("path", request.getRequestURL().toString());

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(response);
    }

}
