package com.pearson.tutorials.exception.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.pearson.tutorials.exception.ExceptionMessage;
import com.pearson.tutorials.exception.NoteNotFoundException;

/**
 * The Class NoteExceptionHandler.
 *
 * @author Danushka Jayamaha
 */
@RestControllerAdvice
public class NoteExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Resource not found exception.
     *
     * @param req
     *            the request
     * @param ex
     *            the exception
     * @return the exception message
     */
    @ExceptionHandler(NoteNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ExceptionMessage resourceNotFoundException(final HttpServletRequest req, final NoteNotFoundException ex) {

        return new ExceptionMessage(ex.getCode(), ex.getMessage());
    }
}