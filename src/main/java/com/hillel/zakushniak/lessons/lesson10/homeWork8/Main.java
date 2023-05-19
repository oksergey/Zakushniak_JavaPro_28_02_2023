package com.hillel.zakushniak.lessons.lesson10.homeWork8;

public class Main {
    public static void main(String[] args) {

        FileNavigator myStorage = new FileNavigator();

//Task 2
        myStorage.add(new FileData("note.txt", 34, "D:/documents"));
        myStorage.add(new FileData("first.app", 12, "D:/documents"));
        myStorage.add(new FileData("music.mp3", 56, "D:/documents"));
        myStorage.add(new FileData("musicle.mp3", 56, "D:/documents"));
        myStorage.add(new FileData("film.mpeg", 1000, "D:/documents"));

//Task 3
        System.out.println();
        System.out.println("Files founded: " + myStorage.find("D:/documents"));

//Task 4
        System.out.println();
        System.out.println("Files filtered by size: " + myStorage.filterBySize(35));


//Task 6*
        System.out.println();
        System.out.println("Sorted by size: ");
        System.out.println(myStorage.sortBySize());

//Task 7**
        System.out.println();
        myStorage.add(new FileData("picture.jpg", 4567, "D:/Users/Pictures"));

//Task 5
        System.out.println();
        System.out.println("Storage removing");
        myStorage.remove("D:/documents");
        myStorage.draw();
    }
}
