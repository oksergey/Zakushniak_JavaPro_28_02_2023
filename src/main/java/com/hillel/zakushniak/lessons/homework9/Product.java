package main.java.com.hillel.zakushniak.lessons.homework9;


import java.time.LocalDate;

public class Product {
    private final String type;
    private double price;
    boolean isDiscount;
    private LocalDate dateAdded;

    public Product(String type, double price, boolean isDiscount, int year, int month, int day) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.dateAdded = LocalDate.of(year, month, day);
    }

    public Product(String type, double price, boolean isDiscount) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
    }

    @Override
    public String toString() {
        return "\n" + "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", isDiscount=" + isDiscount +
                ", dateAdded=" + dateAdded +
                '}';
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
