package main.java.com.hillel.zakushniak.lessons.lesson10.homeWork8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        FileNavigator myStorage = new FileNavigator();

        myStorage.add(new FileData("first.app", 123, "D:/documents"));
        myStorage.add(new FileData("note.txt", 456, "D:/documents"));
        myStorage.add(new FileData("music.mp3", 6789, "D:/documents"));
        myStorage.add(new FileData("note.txt", 23, "D:/Users/Pictures"));
        myStorage.add(new FileData("picture.jpg", 4567, "D:/Users/Pictures"));


//        myStorage.draw();

        System.out.println("Files founded: " + myStorage.find("D:/Users/Pictures") + "\n");

        System.out.println("Files filtered by size: " + myStorage.filterBySize(222) + "\n");

        myStorage.remove("D:/Users/Pictures");

        myStorage.draw();

        myStorage.sortBySize();

    }
}
