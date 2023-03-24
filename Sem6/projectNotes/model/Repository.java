package projectNotes.model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();

    String createNote(Note note);

    void saveNotes(List<Note> notes);
}
