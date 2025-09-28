package com.example.questionapp.exceptions;

public class DataNotFoundException extends RuntimeException{
    // Constructor with message
    public DataNotFoundException(String message) {
        super(message);
    }

    // Constructor with message and cause
    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor with cause only
    public DataNotFoundException(Throwable cause) {
        super(cause);
    }
}
