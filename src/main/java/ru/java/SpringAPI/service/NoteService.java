package ru.java.SpringAPI.service;

import ru.java.SpringAPI.model.Note;

import java.util.List;

public interface NoteService {
    Note createNote(Note note);
    List<Note> getAllNote();
    Note getNoteById(Long id);
    Note updeteNote(Note note);
    void deleteNote(Long id);
}
