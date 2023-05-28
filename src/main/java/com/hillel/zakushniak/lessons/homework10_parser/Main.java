package main.java.com.hillel.zakushniak.lessons.homework10_parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userInput;

        while (true) {
            System.out.println("Please input the name of file");
            Scanner input = new Scanner(System.in);
            userInput = input.nextLine().toLowerCase();

            boolean book = Task1.isFileExist(userInput);
            if (book) break;
        }

        System.out.println("Here are top10Entries in the book:");
        System.out.println(Task2.wordsCalculator(userInput));

        System.out.println();
        System.out.println("There are " + Task3.calculateUnique(userInput) + " unique words in the book!");

        System.out.println();
        Task4.getStatisticFile(userInput);


    }
}
