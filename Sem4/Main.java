package Sem4;

import Sem4.items.Archer;
import Sem4.items.SwordsMan;
import Sem4.items.Warrior;
import Sem4.team.Team;
import Sem4.weapons.Bow;
import Sem4.weapons.Sword;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---START---\n");

        Team<Archer> archerTeam = new Team<>("Archer");
        archerTeam.addWarrior(new Archer("Vasiliy", new Bow()))
                .addWarrior(new Archer("Pyotr", new Bow()))
                .addWarrior(new Archer("Michail", new Bow()))
                .addWarrior(new Archer("Grigory", new Bow()));

        System.out.println(archerTeam);

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new Archer("Vasiliy", new Bow()))
                .addWarrior(new SwordsMan("Pyotr", new Sword()))
                .addWarrior(new Archer("Michail", new Bow()))
                .addWarrior(new SwordsMan("Grigory", new Sword()));

        System.out.println(mixTeam);

        SwordsMan pyotr = new SwordsMan("Pyotr", new Sword());
        Warrior michail = new Archer("Michail", new Bow());

        System.out.println("---The battle---");
        while (pyotr.getHealthPoint() > 0 && michail.getHealthPoint() > 0) {
            int damage1 = pyotr.hitDamage(michail);
            int damage2 = michail.hitDamage(pyotr);
            System.out.printf("SWORDSMAN-Pyotr's health: %d (Got damage: %d) x ARCHER-Michail's health: %d (Got damage: %d)\n",
                    pyotr.getHealthPoint(), damage2, michail.getHealthPoint(), damage1);
        }
        if (pyotr.getHealthPoint() > 0)
            System.out.println("WINNER's Pyotr!");
        else
            System.out.println("WINNER's Michail!");
    }
}
