package Sem4.items;

import java.util.Random;

import Sem4.weapons.Weapon;

public abstract class Warrior<T extends Weapon> {

    private String name;
    protected T weapon;
    protected Random rnd = new Random();
    private int healthPoint;

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealtPoint(int damage) {
        this.healthPoint -= damage;
    }

    public Warrior(String name, T weapon) {
        this.name = name;
        this.weapon = weapon;
        healthPoint = 100;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealtPoint(damage);
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
