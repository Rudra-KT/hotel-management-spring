package com.dev.rudra.errorhandler;

public class NoStaffFoundException extends Throwable {

    public NoStaffFoundException(String message) {
        super(String.format("Error: %s", message));
    }
}
