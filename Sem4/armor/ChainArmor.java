package Sem4.armor;

public class ChainArmor extends Protection {

    @Override
    public int protection() {
        return 50 + protectionStatus.nextInt(-25, 10);
    }

    @Override
    public String toString() {
        return "Chain armor [Protection: " + protection() + "]";
    }
}
