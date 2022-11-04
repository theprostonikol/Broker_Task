package app;

public class ProductA extends Product {
    int qnty;
    double price;

    public ProductA(String name, int qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }

    public String infoProduct() {
        String resultSale = Rounder.roundValue(calcSales(qnty, price));
        return "Товар: " + getName() + "\nОбъем продаж (грн.): " + resultSale;
    }

    @Override
    public double calcSales(double quota, double price) {
        return quota * price;
    }
}
