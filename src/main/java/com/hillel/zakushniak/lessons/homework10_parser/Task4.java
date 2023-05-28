package main.java.com.hillel.zakushniak.lessons.homework10_parser;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 4. Записать статистику которую сделали выше в файл ( слово -> количество символов) в конце общее количество слов (название файла типа {bookName}_statistic.txt )
 * <p>
 * <p>
 * <p>
 * 5. Также вывести статистику в консоль
 */

public class Task4 {

    static void getStatisticFile(String filename) {

        String statisticFileName = filename + "_statistic.txt";

        try (FileWriter fileWriter = new FileWriter(statisticFileName, true)) {

            fileWriter.write("Here are top10Entries in the book:" + "\n" + Task2.wordsCalculator(filename));

            fileWriter.write("\n" + "There are " + Task3.calculateUnique(filename) + " unique words in the book!");


        } catch(IOException e) {
            throw new RuntimeException(e);
        }


    }
}
