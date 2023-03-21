package Sem5.controllers;

import java.util.List;

import Sem5.model.Repository;
import Sem5.model.User;
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

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        User user = userSearch(userId, users);
        return user;
    }

    private static User userSearch(String userId, List<User> users) throws Exception {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("User not found");
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
}
