package Sem4;

import Sem4.armor.ChainArmor;
import Sem4.armor.HaavyShield;
import Sem4.armor.RuggedArmor;
import Sem4.items.Archer;
import Sem4.items.SwordsMan;
import Sem4.items.Warrior;
import Sem4.team.Team;
import Sem4.weapons.Bow;
import Sem4.weapons.Sword;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---START---\n");

        Team<Archer> archerTeam = new Team<>("Archer Warriors");
        archerTeam.addWarrior(new Archer("Vasiliy", new Bow(), new ChainArmor()))
                .addWarrior(new Archer("Pyotr", new Bow(), new ChainArmor()))
                .addWarrior(new Archer("Michail", new Bow(), new ChainArmor()))
                .addWarrior(new Archer("Grigory", new Bow(), new ChainArmor()));

        System.out.println(archerTeam);

        Team<Warrior> mixTeam = new Team<>("Mixed Warriors");
        mixTeam.addWarrior(new Archer("Vasiliy", new Bow(), new ChainArmor()))
                .addWarrior(new SwordsMan("Pyotr", new Sword(), new RuggedArmor(), new HaavyShield()))
                .addWarrior(new Archer("Michail", new Bow(), new ChainArmor()))
                .addWarrior(new SwordsMan("Grigory", new Sword(), new RuggedArmor(), new HaavyShield()));

        System.out.println(mixTeam);

        SwordsMan pyotr = new SwordsMan("Pyotr", new Sword(), new RuggedArmor(), new HaavyShield());
        Warrior michail = new Archer("Michail", new Bow(), new ChainArmor());

        System.out.println("---The battle: Pyotr x Michail---");
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
