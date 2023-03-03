package Sem4.armor;

import Sem4.items.Warrior;

public class RuggedArmor implements Armor {

    @Override
    public int protectionArmor() {
        return 80 + Warrior.rnd.nextInt(-40, 20);
    }

    @Override
    public String toString() {
        return "Rugged Armor [Protection: " + protectionArmor() + "]";
    }
}
