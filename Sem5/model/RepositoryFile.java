package Sem5.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {

    private static UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getID());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        saveUsers(users);
        return id;
    }

    public void saveUsers(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item : users) {
            if (UserMapper.delimiter == ",")
                lines.add(mapper.mapComma(item));
            if (UserMapper.delimiter == ";")
                lines.add(mapper.mapSemicolon(item));
            if (UserMapper.delimiter == " ")
                lines.add(mapper.mapSpace(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
