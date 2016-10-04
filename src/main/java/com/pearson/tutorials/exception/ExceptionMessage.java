package com.pearson.tutorials.exception;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class ExceptionMessage.
 *
 * @author Danushka Jayamaha
 */
@JsonInclude(Include.NON_NULL)
public class ExceptionMessage {

    /** The code. */
    private int code;

    /** The message. */
    private String message;

    /** The errors. */
    private Map<String, String> errors;

    public ExceptionMessage() {
    }

    /**
     * Instantiates a new exception message.
     *
     * @param code
     *            the code
     * @param message
     *            the message
     */
    public ExceptionMessage(final int code, final String message) {
        this.code = code;
        this.message = message;
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

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     *
     * @param message
     *            the message to set
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * Gets the errors.
     *
     * @return the errors
     */
    public Map<String, String> getErrors() {
        return errors;
    }

    /**
     * Sets the errors.
     *
     * @param errors
     *            the errors to set
     */
    public void setErrors(final Map<String, String> errors) {
        this.errors = errors;
    }
}