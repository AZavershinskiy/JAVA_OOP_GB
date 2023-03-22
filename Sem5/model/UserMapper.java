package Sem5.model;

public class UserMapper {

    public static String delimiter;

    public String map(User user) {
        return String.format("%s,%s,%s,%s",
                user.getID(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(delimiter);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}