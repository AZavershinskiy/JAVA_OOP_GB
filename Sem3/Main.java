package Sem3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User[] BillClinton = new User[] {
                new User("Monika", "Lewinsky", 49),
                new User("Monika", "Lewinsky", 18) };

        User[] users = new User[] {
                new User("Bill", "Clinton", 76, BillClinton),
                new User("Bill", "Gates", 67),
                new User("Tom", "Cruise", 60),
                new User("Cipollino", "Rodari", 72) };

        User.setSorter(new User.SortedLastName());

        Personal personal = new Personal(users);
        
        System.out.print("\n---foreach users---");
        for (User user : personal) {
            System.out.print(user);
        }

        List<User> myUsers = personal.toList();

        Collections.sort(myUsers);

        System.out.println("\n\n---users SortedLastName---");
        System.out.println(myUsers);

        User Boss = new User("Alex", "Macedon", 32, users);

        Company company = new Company(Boss);

        System.out.print("\n---foreach company---");
        for (User user : company) {
            System.out.print(user);
        }

        System.out.print("\n\n---Lambda company---");
        company.forEach(item -> System.out.print(item));

        System.out.print("\n\n---Lambda users---");
        Arrays.stream(users).forEach(user -> System.out.print(user));
    }
}
