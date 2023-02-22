package Sem2.zoo;

public class Falcon extends Predator implements Flyable {

    private int flySpeed = 300;

    public Falcon(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Say: Whistling";
    }

    @Override
    public int getSpeedFly() {
        return this.flySpeed;
    }

}
