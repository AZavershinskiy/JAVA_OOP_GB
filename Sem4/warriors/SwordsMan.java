package Sem4.warriors;

import Sem4.armor.Armor;
import Sem4.shield.Shield;
import Sem4.weapons.Sword;

public class SwordsMan extends Warrior<Sword, Armor, Shield> {

    public SwordsMan(String name, Sword weapon, Armor armor, Shield shield) {
        super(name, weapon, armor, shield);
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Swordsman";
    }
}
