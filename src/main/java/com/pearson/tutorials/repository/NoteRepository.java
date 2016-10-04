package com.pearson.tutorials.repository;

import org.springframework.data.repository.CrudRepository;

import com.pearson.tutorials.model.Note;

/**
 * The Interface NoteRepository.
 *
 * @author Danushka Jayamaha
 */
public interface NoteRepository extends CrudRepository<Note, String> {

}