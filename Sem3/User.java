package Sem3;

public class User implements Comparable<User> {

    private String firstName;
    private String lastName;
    private int age;

    private Sorter sort = new SortedFirstName();

    public void setSorter(Sorter sort) {
        this.sort = sort;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        int conditionFirstName = firstName.compareTo(o.firstName);
        if (conditionFirstName != 0) {
            return conditionFirstName;
        }

        int conditionLastName = lastName.compareTo(o.lastName);
        if (conditionLastName != 0) {
            return conditionLastName;
        }
        return this.age - o.age;
    }

    public abstract class Sorter {
        public abstract int compare(User u1, User u2);
    }

    public class SortedFirstName extends Sorter {
        @Override
        public int compare(User u1, User u2) {
            return u1.firstName.compareTo(u2.firstName);
        }
    }

    public class SortedLastName extends Sorter {
        @Override
        public int compare(User u1, User u2) {
            return u1.lastName.compareTo(u2.lastName);
        }
    }
}
