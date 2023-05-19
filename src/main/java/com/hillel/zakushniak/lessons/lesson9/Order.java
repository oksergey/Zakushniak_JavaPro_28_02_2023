package com.hillel.zakushniak.lessons.lesson9;

public class Order {

    private int orderNumber;
    private final String name;

    public Order(int orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "\n" + orderNumber + " | " + name;
    }

}
