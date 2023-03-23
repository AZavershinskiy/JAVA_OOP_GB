package Sem5;

import Sem5.controllers.UserController;
import Sem5.model.FileOperation;
import Sem5.model.FileOperationImpl;
import Sem5.model.Repository;
import Sem5.model.RepositoryFile;
import Sem5.views.Validation;
import Sem5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("sem5/users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository, new Validation());
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}