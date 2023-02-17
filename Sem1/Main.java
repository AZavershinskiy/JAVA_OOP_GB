package Sem1;

import java.sql.Date;

import Sem1.Sandwich.Filling;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        // machine.addProduct(new Product("Lay's", 100));
        machine.addProduct(new Product("Twix", 79));
        // machine.addProduct(new Product("Mars", 79));
        machine.addProduct(new Product("Alenka", 69));
        // machine.addProduct(new Product("Kolokolchik", 55));
        // machine.addProduct(new Perishable("Milk - Burenka", 90, new Date(123, 1, 25)));
        // machine.addProduct(new Perishable("Milk - Korovka", 90, new Date(123, 1, 25)));
        machine.addProduct(new Perishable("Milk - Vasilek", 90, new Date(123, 1, 25)));
        machine.addProduct(new Sandwich("Sandwich", 120, new Date(123, 1, 19), Filling.Chicken));
        machine.addProduct(new Sandwich("Sandwich", 110, new Date(123, 1, 19), Filling.Pork));
        machine.addProduct(new Sandwich("Sandwich", 110, new Date(123, 1, 19), Filling.Pork));
        machine.addProduct(new Sandwich("Sandwich", 105, new Date(123, 1, 19), Filling.Vegetables));

        System.out.println("\n---Наличие---");
        System.out.println(machine);
        System.out.println("---Поиск---");
        System.out.println(machine.findProduct("Sandwich"));
        System.out.println(machine.findProduct("Beer")); // empty
        System.out.println("---Продажа---");
        System.out.println("Продано: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("Продано: " + machine.sellProduct(machine.findProduct("Sandwich").get(1)));
        System.out.println("Продано: " + machine.sellProduct(machine.findProduct("Sandwich").get(2)));
        System.out.println("---Остаток---");
        System.out.println(machine);

    }
}
