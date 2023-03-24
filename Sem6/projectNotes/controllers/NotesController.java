package projectNotes.controllers;

import java.util.ArrayList;
import java.util.List;

import projectNotes.model.Note;
import projectNotes.model.Repository;

public class NotesController {

    private final Repository repository;

    public NotesController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        repository.createNote(note);
    }

    public Note readNote(String noteID) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteID, notes);
        return note;
    }

    private static Note noteSearch(String noteID, List<Note> notes) throws Exception {
        for (Note note : notes) {
            if (note.getID().equals(noteID)) {
                return note;
            }
        }
        throw new Exception("Записка не найдена");
    }

    public List<Note> readAllNotes() {
        return repository.getAllNotes();
    }

    public void updateNote(String noteID, Note newNote) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteID, notes);
        note.setTitleNote(newNote.getTitleNote());
        note.setTextNote(newNote.getTextNote());
        note.setTimeNote(newNote.getTimeNote());
        repository.saveNotes(notes);
    }

    public void deleteNote(String readID) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note noteDelete = noteSearch(readID, notes); // добавил для Exception
        List<Note> newNotes = new ArrayList<Note>();
        for (Note note : notes) {
            if (!(note.getID()).equals(noteDelete.getID()))
                newNotes.add(note);
        }
        repository.saveNotes(newNotes);
    }
}
