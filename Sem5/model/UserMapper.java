package Sem5.model;

public class UserMapper {

    public static String delimiter;

    public String mapComma(User user) {
        return String.format("%s,%s,%s,%s",
                user.getID(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public String mapSemicolon(User user) {
        return String.format("%s;%s;%s;%s",
                user.getID(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public String mapSpace(User user) {
        return String.format("%s %s %s %s",
                user.getID(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(delimiter);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}