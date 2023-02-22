package Sem2.zoo;

import Sem2.zoo.radio.Sayable;

public abstract class Animal implements Sayable{

    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract String feed();

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if(this instanceof Runable) {
            str.append(" Run speed: " + ((Runable)this).getSpeedRun());
        }
        if(this instanceof Flyable) {
            str.append(" Fly speed: " + ((Flyable)this).getSpeedFly());
        }
        if (this instanceof Swimable) {
            str.append(" Swim speed: " + ((Swimable)this).getSpeedSwim());
        }
        return String.format("%s km/h - %s (eating: %s)", str, this.name, this.feed());
    }
}
