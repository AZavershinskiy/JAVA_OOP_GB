package projectNotes.model;

public class NotesMapper {

    public String map(Note note) {
        return String.format("%s;;%s;;%s;;%s",
                note.getID(), note.getTitleNote(), note.getTextNote(), note.getTimeNote());
    }

    public Note map(String line) {
        String[] lines = line.split(";;");
        return new Note(lines[0], lines[1], lines[2], lines[3]);
    }
}