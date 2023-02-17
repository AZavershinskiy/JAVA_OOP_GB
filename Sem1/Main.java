package Sem1;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lay's", 100));
        machine.addProduct(new Product("Twix", 79));
        machine.addProduct(new Product("Mars", 79));
        machine.addProduct(new Product("Alenka", 69));
        machine.addProduct(new Product("Kolokolchik", 55));
        machine.addProduct(new Perishable("Milk - Burenka", 90, new Date(123, 1, 25)));
        machine.addProduct(new Perishable("Milk - Korovka", 90, new Date(123, 1, 25)));
        machine.addProduct(new Perishable("Milk - Vasilek", 90, new Date(123, 1, 25)));

        System.out.println(machine);
        System.out.println("-----");
        System.out.println(machine.findProduct("Alenka"));
        System.out.println(machine.findProduct("Beer"));
        System.out.println("-----");
        System.out.println("Продано: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("-----");
        System.out.println(machine);

    }
}
