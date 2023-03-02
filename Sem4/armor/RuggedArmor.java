package Sem4.armor;

public class RuggedArmor extends Protection {

    @Override
    public int protection() {
        return 80 + protectionStatus.nextInt(-40, 20);
    }

    @Override
    public String toString() {
        return "Rugged Armor [Protection: " + protection() + "]";
    }
}
