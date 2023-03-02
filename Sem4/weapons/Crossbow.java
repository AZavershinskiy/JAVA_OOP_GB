package Sem4.weapons;

public class Crossbow implements Weapon {
    
    protected int distance = 30;

    public int getDistance() {
        return distance;
    }

    @Override
    public int damage() {
        return 65;
    }

    @Override
    public String toString() {
        return "Crossbow [distance: " + distance + ", damage: " + damage() + "]";
    }
}
