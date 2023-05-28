package main.java.com.hillel.zakushniak.lessons.homework10_parser;

import java.io.FileReader;
import java.io.IOException;

/**
 * 1. будет предложено ввести имя книги и если книги нету в корне проекта ( где именно хранить книги на ваше усмотрение но должно все храниться под src/ ) Получить сообщение в консоле что такой книги нет
 */
public class Task1 {

    static boolean isFileExist(String filename) {

        try (FileReader FileReader = new FileReader(filename)) {
            return true;
        } catch (
                IOException e) {
            System.err.println("Wrong name. Please check and try again!");
        }
        return false;
    }

}