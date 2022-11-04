package app;

public abstract class Broker {
    String name;
    String phone;

    public Broker(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    public abstract double calcCommission(double price, int qnty);
}
