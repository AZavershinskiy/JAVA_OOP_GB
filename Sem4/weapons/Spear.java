package Sem4.weapons;

public class Spear implements Weapon {
    
    @Override
    public int damage() {
        return 60;
    }

    @Override
    public String toString() {
        return "Spear [Damage: " + damage() + "]";
    }
}
