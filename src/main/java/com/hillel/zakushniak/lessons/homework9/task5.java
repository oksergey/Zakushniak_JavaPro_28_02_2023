package com.hillel.zakushniak.lessons.homework9;

import java.util.List;

/**
 * 5.1 Цей клас Product, який складається з властивостей:
 * <p>
 * - тип
 * <p>
 * - ціна
 * <p>
 * - можливість застосування знижки
 * <p>
 * - дата додавання (можна використовувати тип даних java.time.LocalDate, java.time.LocalDateTime або java.util.Date)
 * <p>
 * 5.2 Реалізувати метод калькуляції загальної вартості продуктів, які відповідають наступним критеріям:
 * <p>
 * - продукт додано протягом поточного року
 * <p>
 * - продукт має тип “Book”
 * <p>
 * - ціна продукту не перевищує 75
 */

public class task5 {
    public static void main(String[] args) {


        List<Product> products = List.of(
                new Product("meat", 150, true),
                new Product("milk", 35, true),
                new Product("bread", 28, true),
                new Product("tea", 135, false),
                new Product("coffee", 499, false),
                new Product("banana", 49, false),
                new Product("book", 249, false),
                new Product("book", 24, true),
                new Product("book", 42, true),
                new Product("book", 349, true)
        );

        int year = 2023;
        String productType = "book";
        double maxPrice = 75;

        double totalCost = Product.totalCost(products, productType, maxPrice, year);
        System.out.println(totalCost);


    }
}
