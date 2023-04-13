package main.java.com.hillel.zakushniak.lessons.homework9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
                new Product("meat", 150, true, 2023, 1, 10),
                new Product("milk", 35, true, 2023, 2, 11),
                new Product("bread", 28, true, 2022, 3, 12),
                new Product("tea", 135, false, 2022, 4, 13),
                new Product("coffee", 499, false, 2022, 5, 14),
                new Product("banana", 49, false, 2022, 6, 15),
                new Product("book", 249, false, 2021, 7, 16),
                new Product("book", 24, true, 2021, 8, 17),
                new Product("book", 349, true, 2020, 9, 18)
        );

        List<Product> sortedProducts = products.stream()
                .sorted(Comparator.comparing(product -> product.getDateAdded()))
                .skip(products.size()-3)
                .collect(Collectors.toList());

        System.out.println(sortedProducts);


    }
}
