package Sem3.HomeWork;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("First");
        myList.add("Second");
        myList.add("Third");
        myList.add("Fourth");
        myList.add("Fifth");

        System.out.println("\nElements of 'myList':");
        myList.forEach(item -> System.out.println(item));
    }
}