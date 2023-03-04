package Sem4.warriors;

import java.util.Random;

import Sem4.armor.Armor;
import Sem4.shield.HeavyShield;
import Sem4.shield.LightShield;
import Sem4.shield.Shield;
import Sem4.weapons.Weapon;

public abstract class Warrior<T1 extends Weapon, T2 extends Armor, T3 extends Shield> {

    public static Random rnd = new Random();

    private String name;
    private int healthPoint;
    private int protectionPoint;

    protected T1 weapon;
    protected T2 armor;
    protected T3 shield;

    public int getHealthPoint() {
        return healthPoint + protectionPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public Warrior(String name, T1 weapon, T2 armor, T3 shield) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.shield = shield;
        this.healthPoint = 100;
        this.protectionPoint = armor.protectionArmor() + shield.protectionShield();
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }

    public int getMinShield() {
        return shield.protectionShield();
    }

    @Override
    public String toString() {
        if (shield instanceof LightShield || shield instanceof HeavyShield) {
            return "Warrior [Name: " + name +
                    ", HealthPoint: " + healthPoint +
                    ", Weapon: " + weapon +
                    ", Armor: " + armor +
                    ", Shield: " + shield + "]";
        } else {
            return "Warrior [Name: " + name +
                    ", HealthPoint: " + healthPoint +
                    ", Weapon: " + weapon +
                    ", Armor: " + armor + "]";
        }
    }
}
