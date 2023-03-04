package Sem4.weapons;

public class Sword implements Weapon {
    
    @Override
    public int damage() {
        return 70;
    }

    @Override
    public String toString() {
        return "Sword [Damage: " + damage() + "]";
    }
}
