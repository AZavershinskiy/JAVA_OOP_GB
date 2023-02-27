package Sem3;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[] {
                new User("Bill", "Clinton", 76),
                new User("Monika", "Lewinsky", 49),
                new User("Monika", "Lewinsky", 18),
                new User("Bill", "Gates", 67),
                new User("Tom", "Cruise", 60),
                new User("Cipollino", "Rodari", 72)
        };

        Personal personal = new Personal(users);

        for (User user : personal) {
            System.out.println(user);
        }

        List<User> myUsers = personal.toList();

        Collections.sort(myUsers);
        System.out.println("---Sorted---");
        System.out.println(myUsers);
    }
}
