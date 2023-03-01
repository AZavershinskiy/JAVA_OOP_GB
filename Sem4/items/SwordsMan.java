package Sem4.items;

import Sem4.weapons.Sword;

public class SwordsMan extends Warrior<Sword> {

    public SwordsMan(String name, Sword weapon) {
        super(name, weapon);
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: SwordsMan";
    }
}
