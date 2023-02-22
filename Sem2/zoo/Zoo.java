package Sem2.zoo;

import java.util.ArrayList;
import java.util.List;

import Sem2.zoo.radio.Sayable;

public class Zoo {

    List<Animal> animalList = new ArrayList<>();
    Sayable radio;

    public Zoo(List<Animal> animals, Sayable sayableObj) {
        this.radio = sayableObj;
        animalList.addAll(animals);
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void addAnimal(List<Animal> animals) {
        animalList.addAll(animals);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public List<Sayable> getSayable() {
        List<Sayable> sayableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            sayableList.add(animal);
        }
        sayableList.add(this.radio);
        return sayableList;
    }

    public List<Runable> getRunableList() {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Runable) {
                runableList.add((Runable) animal);
            }
        }
        return runableList;
    }

    public List<Swimable> getSwimableList() {
        List<Swimable> swimableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Swimable) {
                swimableList.add((Swimable) animal);
            }
        }
        return swimableList;
    }

    public List<Flyable> getFlyableList() {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }

    public Runable getRunChampion() {
        List<Runable> runners = getRunableList();
        Runable champion = runners.get(0);
        for (Runable r : runners) {
            if (champion.getSpeedRun() < r.getSpeedRun()) {
                champion = r;
            }
        }
        return champion;
    }

    public Swimable getSwimChampion() {
        List<Swimable> swimmers = getSwimableList();
        Swimable champion = swimmers.get(0);
        for (Swimable s : swimmers) {
            if (champion.getSpeedSwim() < s.getSpeedSwim()) {
                champion = s;
            }
        }
        return champion;
    }

    public Flyable getFlyChampion() {
        List<Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable f : flyers) {
            if (champion.getSpeedFly() < f.getSpeedFly()) {
                champion = f;
            }
        }
        return champion;
    }

}
