package Sem1;

import java.util.Date;

public class Perishable extends Product {

    private Date expireDate = new Date();
    
    public Perishable(String name, float cost, Date expirDate) {
        super(name, cost);
        this.expireDate = expirDate;
    }

    @Override
    public String toString() {
        return String.format("%s, Годен до: %s", super.toString(), expireDate);
    }
}
