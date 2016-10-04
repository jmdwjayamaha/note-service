package com.pearson.tutorials.exception;

/**
 * The Class NoteException.
 *
 * @author Danushka Jayamaha
 */
public class NoteException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4836827547108110089L;

    /** The code. */
    private int code;

    /**
     * Instantiates a new note exception.
     *
     * @param code
     *            the code
     * @param message
     *            the message
     */
    public NoteException(final int code, final String message) {
        super(message);
        this.code = code;
    }

    /**
     * Gets the code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code
     *            the code to set
     */
    public void setCode(final int code) {
        this.code = code;
    }
}