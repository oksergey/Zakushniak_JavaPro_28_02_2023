package main.java.com.hillel.zakushniak.lessons.homework9;

import java.util.List;

/**
 * 4.1 Даний клас Product, який складається з властивостей:
 * <p>
 * - тип
 * <p>
 * - ціна
 * <p>
 * - можливість застосування знижки
 * <p>
 * - дата додавання (можна використовувати тип даних java.time.LocalDate, java.time.LocalDateTime або java.util.Date)
 * <p>
 * 4.2 Реалізувати метод отримання трьох останніх доданих продуктів
 */

public class task4 {
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

        System.out.println(Product.findLastAdded(products, 3));


    }
}
