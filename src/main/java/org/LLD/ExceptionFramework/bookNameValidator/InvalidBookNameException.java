package org.LLD.ExceptionFramework.bookNameValidator;

public class InvalidBookNameException extends Exception {
    public InvalidBookNameException(String message) {
        super(message);
    }
}
