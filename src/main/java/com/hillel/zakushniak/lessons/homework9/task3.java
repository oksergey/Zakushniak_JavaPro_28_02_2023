package main.java.com.hillel.zakushniak.lessons.homework9;

import java.util.List;

/**
 * 3.1 Даний клас Product, який складається з властивостей:
 * - тип
 * - ціна
 * - можливість застосування знижки
 * 3.2 Реалізувати метод отримання найдешевшого продукту з категорії “Book”
 * 3.3 У випадку, якщо жоден продукт не знайдено (ситуація, коли немає продукту з категорією),
 * викинути виняток з повідомленням “Продукт [категорія: ім'я_категорії] не знайдено”.
 */

public class task3 {
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
                new Product("book", 349, true)
        );

        try {
            System.out.println(Product.findMinPrice(products, "book"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
