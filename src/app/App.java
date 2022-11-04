package app;

import java.util.Scanner;

public class App {

    static String brokerName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductA product;
    static BrokerA broker;
    static String infoBroker;
    static String infoProduct;

    public static void main(String[] args) {
        doInputs();

        showData(processData());
    }

    private static void doInputs() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Привет, какое твое имя?");
        brokerName = sc.nextLine();

        System.out.print("Пожалуйста, введите ваш телефон:");
        phone = sc.nextLine();

        System.out.print("Какое имя продукта?");
        productName = sc.nextLine();

        System.out.print("Какая цена продукта?");
        price = sc.nextDouble();

        System.out.print("Сколько вы продали за эту неделю?");
        quantity = sc.nextInt();
    }


    private static String processData() {
        broker = new BrokerA(brokerName, phone, email);
        infoBroker = broker.infoBroker();

        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();

        roundBonus = Rounder.roundValue(broker.calcCommission(price, quantity));

        return infoBroker + infoProduct + "\nБонус (грн.): " + roundBonus;
    }

    private static void showData(String output) {
        System.out.println(output);
    }
}
