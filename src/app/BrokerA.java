package app;


public class BrokerA extends Broker {
    String email;

    public BrokerA(String name, String phone, String email) {
        super(name, phone);
        this.email = email;
    }

    public String infoBroker() {
        String name = getName();
        String phone = getPhone();
        return "Брокер: " + name + ", " + phone + ", " + email + "," + "\n";
    }

    @Override
    public double calcCommission(double price, int qnty) {
        double sales = qnty * price;
        double commisions;
        if (sales < 100000) {
            commisions = sales * 0.1;
        } else if (sales > 100000 && sales <= 300000) {
            commisions = sales * 0.15;
        } else {
            commisions = sales * 0.2;
        }
        return commisions;
    }
}