package Sem4.armor;

import Sem4.items.Warrior;

public class ChainArmor implements Armor {

    @Override
    public int protectionArmor() {
        return 50 + Warrior.rnd.nextInt(-25, 10);
    }

    @Override
    public String toString() {
        return "Chain armor [Protection: " + protectionArmor() + "]";
    }
}
