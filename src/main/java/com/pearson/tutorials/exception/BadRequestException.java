package com.pearson.tutorials.exception;

import org.springframework.http.HttpStatus;

/**
 * The Class BadRequestException.
 *
 * @author Danushka Jayamaha
 */
public class BadRequestException extends NoteException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8454870022974731248L;

    /**
     * Instantiates a new bad request exception.
     *
     * @param message
     *            the message
     */
    public BadRequestException(final String message) {
        super(HttpStatus.BAD_REQUEST.value(), message);
    }
}