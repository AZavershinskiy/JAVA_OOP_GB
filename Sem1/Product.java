package Sem1;

import java.util.Date;

public class Product {
    private String name;
    private float cost;
    private Date localDate = new Date();

    public Product(String name, float cost) {
        this.name = name;
        this.cost = cost;
    }

    public Product() {
        this("0", 0);
    }

    public void setLoadDate(Date loadDate) {
        this.localDate = loadDate;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.name.equals(((Product) obj).name) && this.cost == (((Product) obj).cost));
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s, Цена: %f, Дата загрузки: %s", name, cost, localDate);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + (int) cost;
    }
}
