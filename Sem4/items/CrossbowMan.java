package Sem4.items;

import Sem4.armor.Armor;
import Sem4.weapons.Crossbow;

public class CrossbowMan extends Warrior<Crossbow, Armor> implements DistanceAttacker {

    private int distance;

    public CrossbowMan(String name, Crossbow weapon, Armor armor) {
        super(name, weapon, armor, armor);
        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Crossbowman [distance skill = " + distance + "]";
    }
}
