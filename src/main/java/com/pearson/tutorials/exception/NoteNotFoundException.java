package com.pearson.tutorials.exception;

import org.springframework.http.HttpStatus;

/**
 * The Class NoteNotFoundException.
 *
 * @author Danushka Jayamaha
 */
public class NoteNotFoundException extends NoteException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -554381281953166386L;

    /**
     * Instantiates a new note not found exception.
     *
     * @param message
     *            the message
     */
    public NoteNotFoundException(final String message) {
        super(HttpStatus.NOT_FOUND.value(), message);
    }
}