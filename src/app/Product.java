package app;

public abstract class Product {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract double calcSales(double quota, double price);

    public String getName() {
        return name;
    }
}
