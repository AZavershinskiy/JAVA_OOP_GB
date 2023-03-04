package Sem4.warriors;

import Sem4.armor.ChainArmor;
import Sem4.shield.LightShield;
import Sem4.weapons.Crossbow;

public class CrossbowMan extends Warrior<Crossbow, ChainArmor, LightShield> implements DistanceAttacker {

    private int distance;

    public CrossbowMan(String name, Crossbow weapon, ChainArmor armor, LightShield shield) {
        super(name, weapon, armor, shield);
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
