package projectNotes.model;

public class Note {
    private String id = "";
    private String titleNote;
    private String textNote;
    private String timeNote;

    public Note(String titleNote, String textNote, String timeNote) {
        this.titleNote = titleNote;
        this.textNote = textNote;
        this.timeNote = timeNote;
    }

    public Note(String id, String titleNote, String textNote, String timeNote) {
        this(titleNote, textNote, timeNote);
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitleNote() {
        return titleNote;
    }

    public void setTitleNote(String titleNote) {
        this.titleNote = titleNote;
    }

    public String getTextNote() {
        return textNote;
}

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }

    public String getTimeNote() {
        return timeNote;
    }

    public void setTimeNote(String timeNote) {
        this.timeNote = timeNote;
    }

    @Override
    public String toString() {
        return String.format("Идентификатор: %s\nЗаголовок: %s\nТекст записки: %s\nДата/время: %s",
                id, titleNote, textNote, timeNote);
    }
}
