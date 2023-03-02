package Sem4.items;

import Sem4.armor.Armor;
import Sem4.weapons.Sword;

public class SwordsMan extends Warrior<Sword, Armor> {

    public SwordsMan(String name, Sword weapon, Armor armor, Armor shield) {
        super(name, weapon, armor, shield);
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Swordsman";
    }
}
