package Sem2;

import java.util.List;

import Sem2.zoo.Animal;
import Sem2.zoo.Cow;
import Sem2.zoo.Crocodile;
import Sem2.zoo.Dolphin;
import Sem2.zoo.Duck;
import Sem2.zoo.Falcon;
import Sem2.zoo.Flyable;
import Sem2.zoo.Goat;
import Sem2.zoo.Leo;
import Sem2.zoo.Runable;
import Sem2.zoo.Swimable;
import Sem2.zoo.Zoo;
import Sem2.zoo.radio.Radio;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalList = List.of(
                new Cow("Cow: Murka"),
                new Crocodile("Crocodile: Gena"),
                new Leo("Leo: Lyonya"),
                new Goat("Goat: Marusya"),
                new Duck("Duck: Donald"),
                new Dolphin("Dolphin: Martin"),
                new Falcon("Falcon: Arrow"));

        Zoo zoo = new Zoo(animalList, new Radio());

        System.out.println("--Ranble--");
        for (Runable animal : zoo.getRunableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println("Speed: " + animal.getSpeedRun() + " km/h" + "\n");
        }
        System.out.println("--Flyable--");
        for (Flyable animal : zoo.getFlyableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println("Speed: " + animal.getSpeedFly() + " km/h" + "\n");
        }
        System.out.println("--Swimable--");
        for (Swimable animal : zoo.getSwimableList()) {
            System.out.println(((Animal) animal).getName());
            System.out.println(((Animal) animal).say());
            System.out.println("Speed: " + animal.getSpeedSwim() + " km/h" + "\n");
        }

        System.out.println("--Run chempion--");
        System.out.println(zoo.getRunChampion() + "\n");
        System.out.println("--Fly chempion--");
        System.out.println(zoo.getFlyChampion() + "\n");
        System.out.println("--Swim champion--");
        System.out.println(zoo.getSwimChampion() + "\n");
    }
}
