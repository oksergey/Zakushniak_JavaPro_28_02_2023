package main.java.com.hillel.zakushniak.lessons.homework10_parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * 2. Если книга есть то нужно посчитать 10 самых популярных слов которые имеют больше 2 символов ( hi -> no, hello -> yes) вне зависимости от регистра
 */

public class Task2 {

    static String wordsCalculator(String filename) {

        try (FileReader fr = new FileReader(filename); BufferedReader bufferedReader = new BufferedReader(fr)) {

            List<String> wordsAll = bufferedReader.lines()
                    .map(String::toLowerCase)
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .filter(s -> s.length() > 2).toList();


            Map<String, Integer> wordsCounted = new HashMap<>();

            for (String word : wordsAll) {
                if (wordsCounted.containsKey(word)) {
                    wordsCounted.put(word, wordsCounted.get(word) + 1);
                } else {
                    wordsCounted.put(word, 1);

                }
            }

            return wordsCounted.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10).toList()
                    .toString();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}