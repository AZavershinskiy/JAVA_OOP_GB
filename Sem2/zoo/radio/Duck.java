package Sem2.zoo.radio;

public class Duck extends Herbivores implements Flyable {

    private int flySpeed = 80;
    private int flyAlt = 3000;

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Quack";
    }

    @Override
    public int getSpeedFly() {
        return this.flySpeed;
    }

    @Override
    public int getHigh() {
        return this.flyAlt;
    }
}
