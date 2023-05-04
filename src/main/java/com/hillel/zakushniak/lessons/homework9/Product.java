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

    public void setDiscount(boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Product)) return false;
        final Product other = (Product) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
        if (this.isDiscount() != other.isDiscount()) return false;
        final Object this$dateAdded = this.getDateAdded();
        final Object other$dateAdded = other.getDateAdded();
        if (this$dateAdded == null ? other$dateAdded != null : !this$dateAdded.equals(other$dateAdded)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Product;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final long $price = Double.doubleToLongBits(this.getPrice());
        result = result * PRIME + (int) ($price >>> 32 ^ $price);
        result = result * PRIME + (this.isDiscount() ? 79 : 97);
        final Object $dateAdded = this.getDateAdded();
        result = result * PRIME + ($dateAdded == null ? 43 : $dateAdded.hashCode());
        return result;
    }
}
