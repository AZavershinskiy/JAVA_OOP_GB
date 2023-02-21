package Sem2.zoo;

public class Cow extends Herbivores implements Runable {

    private int runSpeed = 40;

    public Cow(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Moo";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
