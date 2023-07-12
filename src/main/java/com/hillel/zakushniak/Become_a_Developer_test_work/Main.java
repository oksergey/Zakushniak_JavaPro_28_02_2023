package com.hillel.zakushniak.Become_a_Developer_test_work;

import java.util.*;

/**
 * Вам потрібно розробити алгоритм програми, яка повинна виконувати наступне:
 * - програма приймає на вхід довільний текст і знаходить в кожному слові цього тексту найперший символ, який більше НЕ повторюється в аналізуємому слові
 * - далі із отриманого набору символів програма повинна вибрати перший унікальний (тобто той, який більше не зустручається в наборі) і повернути його.
 */
public class Main {
    public static void main(String[] args) {

        String text = "C makes it easy for you to shoot yourself in the foot. C++ makes that harder, but when you do, it blows away your whole leg. (с) Bjarne Stroustrup";

        String[] words = text.split(" ");

        HashMap<Character, Integer> uniqueCharCounts = new LinkedHashMap<>();
        Character firstUniqueChar = null;

        for (String word : words) {
            List<Character> characters = new ArrayList<>();
            for (char c : word.toCharArray()) {
                characters.add(c);
            }
            while (!characters.isEmpty()) {

                firstUniqueChar = characters.get(0);
                characters.remove(0);

                if (!characters.contains(firstUniqueChar))
                    break;
            }
            uniqueCharCounts.put(firstUniqueChar, uniqueCharCounts.getOrDefault(firstUniqueChar, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : uniqueCharCounts.entrySet()) {

            if (entry.getValue() == 1) {
                char result = entry.getKey();
                System.out.println(result);
                break;
            }
        }
    }
}
