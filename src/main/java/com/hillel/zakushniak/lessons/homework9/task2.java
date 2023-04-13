package main.java.com.hillel.zakushniak.lessons.homework9;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2.1 Дан клас Product, який складається з властивостей:
 * - тип
 * - ціна
 * - можливість застосування знижки
 * 2.2 Реалізувати метод отримання всіх продуктів як списку, категорія яких еквівалентна “Book” і з
 * можливістю застосування знижки. Фінальний список повинен містити продукти з застосованою знижкою 10%.
 * Так, якщо Продукт A був з ціною 1.0 USD, то його фінальна ціна залишатиметься 0.9 USD
 */

public class task2 {
    public static void main(String[] args) {

        double discount = 0.1;

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

        List<Product> book = products.stream()
                .filter(product -> product.getType().equals("book"))
                .filter(product -> product.isDiscount())
                .peek(product -> product.setPrice(product.getPrice() * (1 - discount)))
                .collect(Collectors.toList());

        System.out.println(book);
    }


}
