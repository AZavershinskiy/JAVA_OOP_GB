package Sem4.items;

import java.util.Random;

import Sem4.armor.Armor;
import Sem4.weapons.Weapon;

public abstract class Warrior<T1 extends Weapon, T2 extends Armor> {

    private String name;
    private int healthPoint;
    private int protectionPoint;
    protected T1 weapon;
    protected T2 armor;
    protected T2 shield;
    protected Random rnd = new Random();

    public int getHealthPoint() {
        return healthPoint + protectionPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public Warrior(String name, T1 weapon, T2 armor, T2 shield) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.shield = shield;
        this.healthPoint = 100;
        this.protectionPoint = armor.protection() + shield.protection();
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }

    @Override
    public String toString() {
        return "Warrior [name = " + name + ", weapon = " + weapon + ", healthPoint = " + healthPoint + "]";
    }
}
