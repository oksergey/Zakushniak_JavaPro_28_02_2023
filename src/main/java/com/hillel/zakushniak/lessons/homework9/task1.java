package com.hillel.zakushniak.lessons.homework9;

import java.util.List;

public class task1 {
    public static void main(String[] args) {

//        /**
//         1.1 Дан клас Product, який складається з властивостей:
//         - тип
//         - ціна
//         1.2 Реалізувати метод отримання всіх продуктів у вигляді списку, категорія яких еквівалентна “Book”
//         та ціна більш ніж 250.
//         */

        List<Product> products = List.of(
                new Product("meat", 150, true),
                new Product("milk", 35, true),
                new Product("bread", 28, true),
                new Product("tea", 135, false),
                new Product("coffee", 499, false),
                new Product("banana", 49, false),
                new Product("book", 249, false),
                new Product("book", 349, true)
        );

        System.out.println(Product.findAllProducts(products, "book", 250));

    }
}
