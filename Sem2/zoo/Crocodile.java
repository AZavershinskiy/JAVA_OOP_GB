package Sem2.zoo;

public class Crocodile extends Predator implements Runable {

    private int runSpeed = 18;

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Ssssh";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
