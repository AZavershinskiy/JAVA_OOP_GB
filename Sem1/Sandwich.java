package Sem1;

import java.util.Date;

public class Sandwich extends Perishable {

    private Filling filling;

    enum Filling {
        Chicken, Pork, Vegetables
    }

    public Sandwich(String name, float cost, Date expirDate, Filling filling) {
        super(name, cost, expirDate);
        this.filling = filling;
    }

    public Filling getFilling() {
        return this.filling;
    }

    @Override
    public String toString() {
        return String.format("%s, with %s", super.toString(), this.filling);
    }
}
