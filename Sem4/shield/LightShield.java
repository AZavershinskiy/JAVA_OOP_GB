package Sem4.shield;

import Sem4.warriors.Warrior;

public class LightShield implements Shield {

    @Override
    public int protectionShield() {
        return 33 + Warrior.rnd.nextInt(-13, 7);
    }

    @Override
    public String toString() {
        return "Light shield [Protection: " + protectionShield() + "]";
    }
}
