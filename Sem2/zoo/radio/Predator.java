package Sem2.zoo.radio;

public abstract class Predator extends Animal{
    
    public Predator(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }
}