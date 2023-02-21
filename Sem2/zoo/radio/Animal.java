package Sem2.zoo.radio;

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
            str.append("Run speed: " + ((Runable)this).getSpeedRun());
        }
        if(this instanceof Flyable) {
            str.append("Fly speed: " + ((Flyable)this).getSpeedFly());
        }
        return String.format("%s - %s (eating: %s)", str, this.name, this.feed());
    }
}
