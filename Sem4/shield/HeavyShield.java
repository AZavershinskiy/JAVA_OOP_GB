package Sem4.shield;

import Sem4.items.Warrior;

public class HeavyShield implements Shield {

    @Override
    public int protectionShield() {
        return 66 + Warrior.rnd.nextInt(-36, 4);
    }

    @Override
    public String toString() {
        return "Haavy shield [Protection: " + protectionShield() + "]";
    }
}
