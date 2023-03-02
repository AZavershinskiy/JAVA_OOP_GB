package Sem4.items;

import Sem4.armor.Armor;
import Sem4.weapons.Bow;

public class Archer extends Warrior<Bow, Armor> implements DistanceAttacker {

    private int distance;

    public Archer(String name, Bow weapon, Armor armor) {
        super(name, weapon, armor, armor);
        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Archer [distance skill = " + distance + "]";
    }
}
