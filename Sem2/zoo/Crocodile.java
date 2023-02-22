package Sem2.zoo;

public class Crocodile extends Predator implements Runable, Swimable {

    private int runSpeed = 18;
    private int swimSpeed = 28;

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Say: Ssssh";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public int getSpeedSwim() {
        return this.swimSpeed;
    }
}
