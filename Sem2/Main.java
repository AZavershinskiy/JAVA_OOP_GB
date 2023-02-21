package Sem2;

import java.util.List;

import Sem2.zoo.Animal;
import Sem2.zoo.Cow;
import Sem2.zoo.Crocodile;
import Sem2.zoo.Duck;
import Sem2.zoo.Flyable;
import Sem2.zoo.Goat;
import Sem2.zoo.Leo;
import Sem2.zoo.Runable;
import Sem2.zoo.Zoo;
import Sem2.zoo.radio.Radio;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalList = List.of(
                new Cow("Murka"),
                new Crocodile("Gena"),
                new Leo("Lyonya"),
                new Goat("Marusya"),
                new Duck("Donald"));

        Zoo zoo = new Zoo(animalList, new Radio());

        System.out.println("-----");
        for (Runable animal : zoo.getRunableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println(animal.getSpeedRun() + "\n");
        }
        System.out.println("-----");
        for (Flyable animal : zoo.getFlyableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println(animal.getSpeedFly());
            System.out.println(animal.getHigh() + "\n");
        }
        System.out.println("--Run chempion--");
        System.out.println(zoo.getRunChampion());
        System.out.println("--Fly chempion--");
        System.out.println(zoo.getFlyChampion());
    }
}
