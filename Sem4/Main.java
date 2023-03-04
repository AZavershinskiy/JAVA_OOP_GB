package Sem4;

import Sem4.armor.ChainArmor;
import Sem4.armor.RuggedArmor;
import Sem4.shield.HeavyShield;
import Sem4.shield.LightShield;
import Sem4.shield.NoShield;
import Sem4.team.Team;
import Sem4.warriors.Archer;
import Sem4.warriors.CrossbowMan;
import Sem4.warriors.SpearMan;
import Sem4.warriors.SwordsMan;
import Sem4.warriors.Warrior;
import Sem4.weapons.Bow;
import Sem4.weapons.Crossbow;
import Sem4.weapons.Spear;
import Sem4.weapons.Sword;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---START---\n");

        Team<Warrior> shootingTeam = new Team<>("Archer & Crossbowman Warriors");
        shootingTeam.addWarrior(new CrossbowMan("Svyatoslav", new Crossbow(), new ChainArmor(), new LightShield()))
                .addWarrior(new CrossbowMan("Ivan", new Crossbow(), new ChainArmor(), new LightShield()))
                .addWarrior(new Archer("Gennadiy", new Bow(), new ChainArmor(), new NoShield()))
                .addWarrior(new Archer("Fyodr", new Bow(), new ChainArmor(), new NoShield()));

        System.out.println(shootingTeam);

        Team<Warrior> mixTeam = new Team<>("Mixed Warriors");
        mixTeam.addWarrior(new Archer("Vasiliy", new Bow(), new ChainArmor(), new NoShield()))
                .addWarrior(new SpearMan("Pyotr", new Spear(), new RuggedArmor(), new LightShield()))
                .addWarrior(new CrossbowMan("Michail", new Crossbow(), new ChainArmor(), new LightShield()))
                .addWarrior(new SwordsMan("Grigory", new Sword(), new RuggedArmor(), new HeavyShield()));

        System.out.println(mixTeam);

        Archer gennadiy = new Archer("Gennadiy", new Bow(), new ChainArmor(), new NoShield());
        System.out.println("WARRIOR without SHIELD:\n" + gennadiy + "\n");

        System.out.println("\n---The BATTLE: 2 warriors---\n");
        SpearMan alexander = new SpearMan("Alexander", new Spear(), new RuggedArmor(), new LightShield());
        System.out.println(alexander + "\n");

        Warrior dmitriy = new CrossbowMan("Dmitriy", new Crossbow(), new ChainArmor(), new LightShield());
        System.out.println(dmitriy + "\n");

        while (alexander.getHealthPoint() > 0 && dmitriy.getHealthPoint() > 0) {
            int damage1 = alexander.hitDamage(dmitriy);
            int damage2 = dmitriy.hitDamage(alexander);
            System.out.printf("ALEXANDER's health: %d (Got damage: %d) x DMITRIY's health: %d (Got damage: %d)\n",
            alexander.getHealthPoint(), damage2, dmitriy.getHealthPoint(), damage1);
        }
        if (alexander.getHealthPoint() > 0)
            System.out.println("WINNER's ALEXANDER!");
        else
            System.out.println("WINNER's DMITRIY!");
    }
}
