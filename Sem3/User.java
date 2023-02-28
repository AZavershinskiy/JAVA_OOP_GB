package Sem3;

public class User implements Comparable<User> {

    private String firstName;
    private String lastName;
    private int age;

    private Personal personal = new Personal(new User[]{});

    public Personal getPersonal() {
        return personal;
    }

    private static Sorter sort;

    public static void setSorter(Sorter sort) {
        User.sort = sort;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String firstName, String lastName, int age, User[] personal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personal = new Personal(personal);
    }

    @Override
    public String toString() {
        return "\nfirstName = " + firstName + ", lastName = " + lastName + ", age = " + age;
    }

    @Override
    public int compareTo(User o) {
        return sort.compare(this, o);
    }

    public static abstract class Sorter {
        public abstract int compare(User u1, User u2);
    }

    public static class SortedFirstName extends Sorter {
        @Override
        public int compare(User u1, User u2) {
            return u1.firstName.compareTo(u2.firstName);
        }
    }

    public static class SortedLastName extends Sorter {
        @Override
        public int compare(User u1, User u2) {
            return u1.lastName.compareTo(u2.lastName);
        }
    }
}
