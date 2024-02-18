package ru.geekbrains.SpringHW6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.SpringHW6.model.Note;

import java.util.Optional;

public interface NoteRepo extends JpaRepository<Note, Long> {

    //получение заметки по id
    public Optional<Note> findNoteById(Long id);
}
