package ru.itsjava.exceptions;

public class AgeNotValidException extends RuntimeException {
    public AgeNotValidException(String description) {
        super(description);
    }
}
