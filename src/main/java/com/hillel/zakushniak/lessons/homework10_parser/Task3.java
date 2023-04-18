package main.java.com.hillel.zakushniak.lessons.homework10_parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * 3. Посчитать общее количество уникальных слов ( не символов)
 */

public class Task3 {

    public static int calculateUnique(String filename) {

        try (FileReader fr = new FileReader(filename); BufferedReader bufferedReader = new BufferedReader(fr)) {

            List<String> wordsUnique = bufferedReader.lines()
                    .map(String::toLowerCase)
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .toList();

            return wordsUnique.size();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
