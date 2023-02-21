package Sem2.zoo;

import java.util.List;

import Sem2.zoo.radio.Animal;
import Sem2.zoo.radio.Cow;
import Sem2.zoo.radio.Crocodile;
import Sem2.zoo.radio.Duck;
import Sem2.zoo.radio.Flyable;
import Sem2.zoo.radio.Goat;
import Sem2.zoo.radio.Leo;
import Sem2.zoo.radio.Radio;
import Sem2.zoo.radio.Runable;
import Sem2.zoo.radio.Sayable;
import Sem2.zoo.radio.Zoo;

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
        System.out.println("--Run chempion--");
        System.out.println(zoo.getRunChampion());
        System.out.println("--Fly chempion--");
        System.out.println(zoo.getFlyChampion());
    }
    }
}
