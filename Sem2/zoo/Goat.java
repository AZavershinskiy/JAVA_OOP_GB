package Sem2.zoo;

public class Goat extends Herbivores implements Runable {

    private int runSped = 45;
    
    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Meeh";
    }

    @Override
    public int getSpeedRun() {
        return this.runSped;
    }

}
