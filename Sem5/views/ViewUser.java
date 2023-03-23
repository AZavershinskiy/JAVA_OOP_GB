package Sem5.views;

import java.util.List;
import java.util.Scanner;

import Sem5.controllers.UserController;
import Sem5.model.User;

public class ViewUser {

    private final UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com;
        while (true) {
            String command = prompt("\nВведите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT)
                    return;
                switch (com) {
                    case READ:
                        readUser();
                        break;
                    case CREATE:
                        createUser();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                    case LIST:
                        listUsers();
                        break;
                    case SAVEUS:
                        saveUs();
                        break;
                    case DELETE:
                        deleteUser();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void readUser() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        User user = userController.readUser(id);
        System.out.println("\n" + user);
    }

    private void createUser() throws Exception {
        userController.saveUser(inpiutUser());
    }

    private void updateUser() throws Exception {
        String readID = prompt("Введите редактируймый  ID пользователя: ");
        userController.updateUser(readID, inpiutUser());
    }

    private User inpiutUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }

    private void listUsers() {
        List<User> listUsers = userController.readAllUsers();
        for (User user : listUsers) {
            System.out.println("\n" + user);
        }
    }

    private void deleteUser() throws Exception {
        String readID = prompt("Введите ID пользователя для удаления: ");
        userController.deleteUser(readID);
    }

    private void saveUs() {
        String separator = prompt(
                "\nВыберите формат разделителя:\ncomma - запятая,\nsemicolon - точка с запятой,\nspace - пробел.\n\nВыбор: ");
        userController.saveUs(separator);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}