package main.java.com.hillel.zakushniak.lessons.homework11;

/**
 * 1. Створити Клас ArrayValueCalculator
 * 2. Створити метод doCalc. На вхід до методу подається двомірний рядковий масив розміром 4х4.
 * 3. При передачі масиву іншого розміру в метод doCalc необхідно викинути виняток ArraySizeException.
 * 4. Метод doCalc повинен пройтися за всіма елементами масиву і перетворити в int (використовувати Integer#parseInt) і підсумувати.
 * Після загального підсумовування метод повертає фінальний результат у вигляді int.
 * 5.Якщо в якомусь елементі масиву перетворення не вдалося (наприклад, в комірці лежить символ або текст замість числа),
 * тоді викинути виняток ArrayDataException, з деталізацією в якому саме комірці лежать невірні дані.
 * 6. У методі main() викликати отриманий метод, обробити можливі винятки ArraySizeException та ArrayDataException,
 * та вивести результат розрахунку.
 * 7. Необхідно дотримуватись усіх правил збереження контексту викинутого виключення.
 * 8. При вилові винятків у процесі перетворення, взяти до уваги винятки, що викидаються іншими (сторонніми) методами, що використовуються.
 */
public class Main {
    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "0"},
                {"15", "6", "7", "8"},
                {"-10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        int sum;

        try {
            sum = ArrayValueCalculator.doCalc(array);
            System.out.println("Sum of all digits in this matrix equals: " + sum);
        } catch (ArraySizeException e) {
            System.err.println("Please, give an array with dimension 4x4!");
        } catch (ArrayDataException exception) {
            System.err.println(exception);
        }

    }
}
