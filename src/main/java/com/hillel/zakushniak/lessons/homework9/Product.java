package com.hillel.zakushniak.lessons.homework9;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
    private final String type;
    private double price;
    boolean isDiscount;
    private final LocalDate dateAdded;

    public Product(String type, double price, boolean isDiscount) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.dateAdded = LocalDate.now();
    }


    public static List<Product> findAllProducts(List<Product> products, String productType, int minPrice) {
        return products.stream()
                .filter(product -> product.getType().equals(productType))
                .filter(product -> product.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

    public static List<Product> getDiscount(List<Product> products, String productType, double discount) {
        return products.stream()
                .filter(product -> product.getType().equals(productType))
                .filter(Product::isDiscount)
                .peek(product -> product.setPrice(product.getPrice() * (1 - discount)))
                .collect(Collectors.toList());
    }

    public static double findMinPrice(List<Product> products, String productType) throws Exception {

        return products.stream()
                .filter(product -> product.getType().equals(productType))
                .mapToDouble(Product::getPrice)
                .min()
                .orElseThrow(() -> new Exception("Product not found!"));
    }

    public static List<Product> findLastAdded(List<Product> products, int quantity) {

        if (products.size() < quantity) return products;

        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded))
                .skip(products.size() - quantity)
                .collect(Collectors.toList());

    }

    public static double totalCost(List<Product> products, String productType, double maxPrice, int year) {
        return products.stream()
                .filter(p -> p.getDateAdded().getYear() == year)
                .filter(p -> p.getType().equals(productType))
                .filter(p -> p.getPrice() < maxPrice)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static Map<String, List<Product>> groupingByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));

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
