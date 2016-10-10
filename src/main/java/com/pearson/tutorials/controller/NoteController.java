package com.pearson.tutorials.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pearson.tutorials.exception.BadRequestException;
import com.pearson.tutorials.model.Note;
import com.pearson.tutorials.service.NoteService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * The Class NoteController.
 *
 * @author Danushka Jayamaha
 */
@RestController
@RequestMapping(value = "/notes")
public class NoteController {

    /** The note service. */
    @Autowired
    private NoteService noteService;

    /**
     * Creates the note.
     *
     * @param note
     *            the note
     * @return the HTTP entity
     */
    @ApiOperation(value = "/notes", notes = "Create Note", response = Note.class)
    @ApiResponses(value = { @ApiResponse(code = 201, message = "Successfully Created"),
            @ApiResponse(code = 400, message = "Invalid Request") })
    @RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public HttpEntity<Note> createNote(
            @ApiParam(value = "Note JSON Object", required = true) @Validated @RequestBody final Note note) {

        return new ResponseEntity<Note>(noteService.createNote(note), HttpStatus.CREATED);
    }

    /**
     * Gets the note.
     *
     * @param noteId
     *            the note ID
     * @return the note
     */
    @ApiOperation(value = "/notes/{noteId}", notes = "Retrieve Note", response = Note.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Successfull"),
            @ApiResponse(code = 404, message = "Note not found") })
    @RequestMapping(value = "/{noteId}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public HttpEntity<Note> getNote(@PathVariable("noteId") final String noteId) {

        return new ResponseEntity<Note>(noteService.getNote(noteId), HttpStatus.OK);
    }

    /**
     * List notes.
     *
     * @return the HTTP entity
     */
    @ApiOperation(value = "/notes", notes = "Retrieve Notes", response = Note.class, responseContainer = "List")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Successfull") })
    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public HttpEntity<Iterable<Note>> listNotes() {

        return new ResponseEntity<Iterable<Note>>(noteService.listNotes(), HttpStatus.OK);
    }

    /**
     * Update note.
     *
     * @param noteId
     *            the note ID
     * @param note
     *            the note
     * @return the HTTP entity
     */
    @ApiOperation(value = "/notes/{noteId}", notes = "Update Note", response = Note.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully Updated"),
            @ApiResponse(code = 404, message = "Note not found") })
    @RequestMapping(value = "/{noteId}", method = RequestMethod.PUT, produces = APPLICATION_JSON_VALUE,
            consumes = APPLICATION_JSON_VALUE)
    public HttpEntity<Note> updateNote(@PathVariable("noteId") final String noteId,
            @Validated @RequestBody final Note note) {

        if (note.getNoteId() == null && !note.getNoteId().equals(noteId)) {
            throw new BadRequestException("Invalid request");
        }

        return new ResponseEntity<Note>(noteService.updateNote(note), HttpStatus.CREATED);
    }

    /**
     * Delete note.
     *
     * @param noteId
     *            the note ID
     * @return the HTTP entity
     */
    @ApiOperation(value = "/notes/{noteId}", notes = "Delete Note", response = Note.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully Deleted"),
            @ApiResponse(code = 404, message = "Note not found") })
    @RequestMapping(value = "/{noteId}", method = RequestMethod.DELETE)
    public HttpEntity<Void> deleteNote(@PathVariable("noteId") final String noteId) {

        noteService.deleteNote(noteId);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}