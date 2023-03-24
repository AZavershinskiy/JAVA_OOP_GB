package projectNotes.views;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import projectNotes.controllers.NotesController;
import projectNotes.model.Note;

public class ViewNotes {

    private final NotesController noteController;

    public ViewNotes(NotesController noteController) {
        this.noteController = noteController;
    }

    public void run() {
        Commands com;
        while (true) {
            String command = prompt(
                    "\nЗАПИСКИ\n\nКоманды:\ncreate - cоздать\nread   - показать\nupdate - обновить\nlist   - показать все\ndelete - удалить\nexit   - выход\n\nВведите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT)
                    return;
                switch (com) {
                    case CREATE:
                        createNote();
                        break;
                    case READ:
                        readNote();
                        break;
                    case UPDATE:
                        updateNote();
                        break;
                    case LIST:
                        listNotes();
                        break;
                    case DELETE:
                        deleteNote();
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void readNote() throws Exception {
        String id = prompt("Идентификатор записки: ");
        Note note = noteController.readNote(id);
        System.out.println("\n" + note);
    }

    private void createNote() throws Exception {
        noteController.saveNote(inputNote());
    }

    private void updateNote() throws Exception {
        String readID = prompt("Введите ID редактируемой записки: ");
        noteController.updateNote(readID, inputNote());
    }

    private Note inputNote() {
        String titleNote = prompt("Заголовок: ");
        String textNote = prompt("Текст записки: ");
        String timeNote = getTimeNote();
        return new Note(titleNote, textNote, timeNote);
    }

    private String getTimeNote() {
        SimpleDateFormat formater = new SimpleDateFormat("d.MMMyyyy/HH:mm:ss");
        Date date = new Date();
        return formater.format(date);
    }

    private void listNotes() {
        List<Note> listNotes = noteController.readAllNotes();
        for (Note note : listNotes) {
            System.out.println("\n" + note);
        }
    }

    private void deleteNote() throws Exception {
        String readID = prompt("Введите ID записки для удаления: ");
        noteController.deleteNote(readID);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}