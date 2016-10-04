package com.pearson.tutorials.controller;

import java.util.List;

import org.springframework.http.HttpEntity;

import com.pearson.tutorials.model.Note;

/**
 * @author Danushka Jayamaha
 *
 */
public class NoteController {

    public HttpEntity<Note> createNote(final Note note) {
        return null;
    }

    public HttpEntity<Note> getNote(final String noteId) {
        return null;
    }

    public HttpEntity<List<Note>> listNotes() {
        return null;
    }

    public HttpEntity<Note> updateNote(final String noteId, final Note note) {
        return null;
    }

    public HttpEntity<Void> deleteNote(final String noteId) {
        return null;
    }
}
