package com.pearson.tutorials.service;

import com.pearson.tutorials.model.Note;

/**
 * The Interface NoteService.
 *
 * @author Danushka Jayamaha
 */
public interface NoteService {

    /**
     * Creates the note.
     *
     * @param note
     *            the note
     * @return the note
     */
    Note createNote(final Note note);

    /**
     * Gets the note.
     *
     * @param noteId
     *            the note id
     * @return the note
     */
    Note getNote(final String noteId);

    /**
     * Update note.
     *
     * @param note
     *            the note
     * @return the note
     */
    Note updateNote(final Note note);

    /**
     * List notes.
     *
     * @return the iterable
     */
    Iterable<Note> listNotes();

    /**
     * Delete note.
     *
     * @param noteId
     *            the note id
     */
    void deleteNote(final String noteId);
}