package Sem4.armor;

public class LightShield extends Protection {

    @Override
    public int protection() {
        return 33 + protectionStatus.nextInt(-16, 7);
    }

    @Override
    public String toString() {
        return "Light shield [Protection: " + protection() + "]";
    }
}
