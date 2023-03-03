package Sem4.items;

import Sem4.armor.Armor;
import Sem4.shield.Shield;
import Sem4.weapons.Spear;

public class SpearMan extends Warrior<Spear, Armor, Shield> {

    public SpearMan(String name, Spear weapon, Armor armor, Shield shield) {
        super(name, weapon, armor, shield);
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Spearman";
    }
}
