package Sem5.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();

    String CreateUser(User user);

    void saveUsers(List<User> users);
}
