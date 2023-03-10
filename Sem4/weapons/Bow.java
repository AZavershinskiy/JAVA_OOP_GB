package Sem4.weapons;

public class Bow implements Weapon {

    protected int distance = 60;

    public int getDistance() {
        return distance;
    }

    @Override
    public int damage() {
        return 45;
    }

    @Override
    public String toString() {
        return "Bow [distance: " + distance + ", damage: " + damage() + "]";
    }
}
