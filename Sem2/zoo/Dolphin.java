package Sem2.zoo;

public class Dolphin extends Predator implements Swimable {

    private int swimSpeed = 40;

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Say: Yelling";
    }

    @Override
    public int getSpeedSwim() {
        return this.swimSpeed;
    }
}
