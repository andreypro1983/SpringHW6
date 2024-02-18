package ru.geekbrains.SpringHW6.services;

import ru.geekbrains.SpringHW6.model.Note;

import java.util.List;
import java.util.Optional;

public interface NoteService {
    List<Note> findAll();

    Note createNote(Note note);

    Note findNoteById(Long id);

    Note updateNoteById(Long id, Note note);

    Boolean deleteNoteById(Long id);
}
