package Sem2.zoo;

public class Duck extends Herbivores implements Flyable, Swimable {

    private int flySpeed = 80;
    private int swimSpeed = 3;

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Say: Quack";
    }

    @Override
    public int getSpeedFly() {
        return this.flySpeed;
    }

    @Override
    public int getSpeedSwim() {
        return this.swimSpeed;
    }
}
