package Sem5.controllers;

import java.util.ArrayList;
import java.util.List;

import Sem5.model.Repository;
import Sem5.model.Separators;
import Sem5.model.User;
import Sem5.model.UserMapper;
import Sem5.views.Validation;

public class UserController {

    private final Repository repository;
    private final Validation validator;

    public UserController(Repository repository, Validation validator) {
        this.repository = repository;
        this.validator = validator;
    }

    public void saveUser(User user) throws Exception {
        validator.validateUser(user);
        repository.CreateUser(user);
    }

    public User readUser(String userID) throws Exception {
        List<User> users = repository.getAllUsers();
        User user = userSearch(userID, users);
        return user;
    }

    private static User userSearch(String userID, List<User> users) throws Exception {
        for (User user : users) {
            if (user.getID().equals(userID)) {
                return user;
            }
        }
        throw new Exception("Пользователь не найден");
    }

    public List<User> readAllUsers() {
        return repository.getAllUsers();
    }

    public void updateUser(String userID, User newUser) throws Exception {
        List<User> users = repository.getAllUsers();
        User user = userSearch(userID, users);
        user.setFirstName(newUser.getFirstName());
        user.setLastName(newUser.getLastName());
        user.setPhone(newUser.getPhone());
        repository.saveUsers(users);
    }

    public void deleteUser(String readID) throws Exception {
        List<User> users = repository.getAllUsers();
        User userDelete = userSearch(readID, users); // добавил для Exception
        List<User> newUsers = new ArrayList<User>();
        for (User user : users) {
            if (!(user.getID()).equals(userDelete.getID()))
                newUsers.add(user);
        }
        repository.saveUsers(newUsers);
    }

    public void saveUs(String separator) {
        Separators sep;
        while (true) {
            try {
                sep = Separators.valueOf(separator.toUpperCase());
                switch (sep) {
                    case COMMA:
                        List<User> users1 = repository.getAllUsers();
                        UserMapper.delimiter = ",";
                        repository.saveUsers(users1);
                        break;
                    case SEMICOLON:
                        List<User> users2 = repository.getAllUsers();
                        UserMapper.delimiter = ";";
                        repository.saveUsers(users2);
                        break;
                    case SPACE:
                        List<User> users3 = repository.getAllUsers();
                        UserMapper.delimiter = " ";
                        repository.saveUsers(users3);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Сохранено");
            break;
        }
    }
}
