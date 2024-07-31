package com.acc.lkm.staticdemo;

class Order {
    int orderId;
    String category;
    String merchant;
    String productName;
    double price;

    public Order(int orderId, String category, String merchant, String productName, double price) {
        this.orderId = orderId;
        this.category = category;
        this.merchant = merchant;
        this.productName = productName;
        this.price = price;
    }

    public static void displayOrder(int orderId, String category, String merchant) {
        System.out.println("Order ID: " + orderId);
        System.out.println("Category: " + category);
        System.out.println("Merchant: " + merchant);
    }

    public static void displayOrder(int orderId, String category, String productName, double price) {
        System.out.println("Order ID: " + orderId);
        System.out.println("Category: " + category);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}

public class Overloadingdemo {
    public static void main(String[] args) {
        Order order1 = new Order(1, "Electronics", "ABC Merchant", "Smartphone", 10000);     
        Order.displayOrder(order1.orderId, order1.category, order1.merchant);
        System.out.println();
        Order.displayOrder(order1.orderId, order1.category, order1.productName, order1.price);
    }
}
