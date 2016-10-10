package com.pearson.tutorials.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pearson.tutorials.exception.NoteNotFoundException;
import com.pearson.tutorials.model.Note;
import com.pearson.tutorials.repository.NoteRepository;
import com.pearson.tutorials.service.NoteService;

/**
 * The Class NoteServiceImpl.
 *
 * @author Danushka Jayamaha
 */
@Service("noteService")
public class NoteServiceImpl implements NoteService {

    /** The note repository. */
    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note createNote(final Note note) {

        final UUID uuid = UUID.randomUUID();
        note.setNoteId(uuid.toString());

        note.setCreatedAt(new Date());
        note.setUpdatedAt(note.getCreatedAt());

        return noteRepository.save(note);
    }

    @Override
    public Note getNote(final String noteId) {

        final Note note = noteRepository.findOne(noteId);
        if (note == null || note.isDeleted()) {
            throw new NoteNotFoundException("The requested note is not found");
        }

        return note;
    }

    @Override
    public Note updateNote(final Note note) {

        final Note existingNote = noteRepository.findOne(note.getNoteId());
        if (existingNote == null || existingNote.isDeleted()) {
            throw new NoteNotFoundException("The requested note is not found");
        }

        existingNote.setTopic(note.getTopic());
        existingNote.setDescription(note.getDescription());
        existingNote.setUpdatedAt(new Date());

        return noteRepository.save(existingNote);
    }

    @Override
    public Iterable<Note> listNotes() {

        return noteRepository.findAll();
    }

    @Override
    public void deleteNote(final String noteId) {

        final Note note = noteRepository.findOne(noteId);
        if (note == null || note.isDeleted()) {
            throw new NoteNotFoundException("The requested note is not found");
        }

        note.setDeleted(true);
        noteRepository.save(note);
    }
}