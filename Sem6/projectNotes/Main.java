package projectNotes;

import projectNotes.controllers.NotesController;
import projectNotes.model.FileOperation;
import projectNotes.model.FileOperationImpl;
import projectNotes.model.Repository;
import projectNotes.model.RepositoryFile;
import projectNotes.views.ViewNotes;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("Sem6/projectNotes/Notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NotesController controller = new NotesController(repository);
        ViewNotes view = new ViewNotes(controller);
        view.run();
    }
}
