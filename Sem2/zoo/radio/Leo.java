package Sem2.zoo.radio;

public class Leo extends Predator implements Runable {

    private int runSpeed = 60;

    public Leo(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Arrh!";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
    
}
