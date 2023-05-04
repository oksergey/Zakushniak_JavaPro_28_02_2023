package com.hillel.zakushniak.lessons.homework9;

import java.util.List;

/**
 * 6.1 Дан клас Product, який складається з властивостей:
 * <p>
 * - ідентифікаційний номер
 * <p>
 * - тип
 * <p>
 * - ціна
 * <p>
 * - можливість застосування знижки
 * <p>
 * – дата додавання (можна використовувати тип даних java.time.LocalDate, java.time.LocalDateTime або java.util.Date)
 * <p>
 * * 6.2 Реалізувати метод групування об'єктів за типом продукту. Таким чином результатом виконання методу
 * <p>
 * буде тип даних “Словник”, що зберігає пару ключ-значення: {тип: список_продуктів}
 */

public class task6 {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("meat", 150, true),
                new Product("milk", 35, false),
                new Product("bread", 28, true),
                new Product("tea", 135, false),
                new Product("coffee", 499, false),
                new Product("banana", 49, false),
                new Product("book", 249, false),
                new Product("book", 24, true),
                new Product("book", 349, true)
        );
        Product.groupingByType(products).forEach((key, value) -> System.out.println("Type: " + key + value));
    }
}
