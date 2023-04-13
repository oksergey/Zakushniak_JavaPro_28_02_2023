package main.java.com.hillel.zakushniak.lessons.homework9;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
                new Product("meat", 150, true, 2023, 1, 10),
                new Product("milk", 35, false, 2023, 2, 11),
                new Product("bread", 28, true, 2022, 3, 12),
                new Product("tea", 135, false, 2022, 4, 13),
                new Product("coffee", 499, false, 2022, 5, 14),
                new Product("banana", 49, false, 2022, 6, 15),
                new Product("book", 249, false, 2021, 7, 16),
                new Product("book", 24, true, 2021, 8, 17),
                new Product("book", 349, true, 2020, 9, 18)
        );

        Map<String, List<Product>> groupingByType = products.stream()
                .collect(Collectors.groupingBy(Product::getType));

        groupingByType.forEach((key, value) -> System.out.println("Type: " + key + ", Products: " + value));

    }
}
