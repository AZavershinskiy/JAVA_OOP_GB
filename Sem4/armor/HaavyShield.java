package Sem4.armor;

public class HaavyShield extends Protection {

    @Override
    public int protection() {
        return 66 + protectionStatus.nextInt(-33, 10);
    }

    @Override
    public String toString() {
        return "Haavy shield [Protection: " + protection() + "]";
    }
}
