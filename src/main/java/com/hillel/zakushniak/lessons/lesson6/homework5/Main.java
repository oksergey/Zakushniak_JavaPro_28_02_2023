package main.java.com.hillel.zakushniak.lessons.lesson6.homework5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // #1
        System.out.println("TASK #1");
        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("hamster");
        animals.add("fish");
        animals.add("rat");
        animals.add("rabbit");
        animals.add("bird");
        animals.add("snake");
        animals.add("bird");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");
        animals.add("fox");

        System.out.println(animals);

        String findAnimal = "doge";
        System.out.println(findAnimal + " = " + countOccurance(animals, findAnimal));
        String findAnimal1 = "dog";
        System.out.println(findAnimal1 + " = " + countOccurance(animals, findAnimal1));
        String findAnimal2 = "bird";
        System.out.println(findAnimal2 + " = " + countOccurance(animals, findAnimal2));
        System.out.println();


        //#2
        System.out.println("TASK #2");
        String[] soundsArray = new String[]{"boom", "ca", "ca", "tru", "la", "la"};
        System.out.println("Before Array: " + Arrays.deepToString(soundsArray));
        System.out.println("After List: " + toList(soundsArray));
        System.out.println();


        //#3
        System.out.println("TASK #3");
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            arrayOfNumbers.add(i);
        }
        arrayOfNumbers.add(6);

        for (int i = 5; i < 10; i++) {
            arrayOfNumbers.add(i);
        }
        arrayOfNumbers.add(9);

        System.out.println(arrayOfNumbers);
        System.out.println(findUnique(arrayOfNumbers));
        System.out.println();

//        #4**
        System.out.println("TASK #4**");
        calcOccurance(animals);
        System.out.println();

//        #4***
        System.out.println("TASK #4***");
        System.out.println(findOccurance(animals));

    }

    private static ArrayList findOccurance(ArrayList<String> animals) {
        ArrayList classesInside = new ArrayList<>();
        ArrayList uniqueAnimals = findUnique(animals);

        for (Object uniqueAnimal : uniqueAnimals) {

            classesInside.add(new Animal((String)uniqueAnimal, countOccurance(animals, (String) uniqueAnimal)));

        }

        return classesInside;
    }

    private static void calcOccurance(ArrayList<String> animals) {

        ArrayList<String> uniqueAnimals = findUnique(animals);


        for (int i = 0; i < uniqueAnimals.size(); i++) {
            System.out.print(uniqueAnimals.get(i) + ": ");
            System.out.println(countOccurance(animals, uniqueAnimals.get(i)));

        }

    }


    private static ArrayList findUnique(ArrayList arrayOfAnything) {

        ArrayList uniqueArray = new ArrayList<>();
        int j;

        for (int i = 0; i < arrayOfAnything.size(); i++) {
            for (j = arrayOfAnything.size() - 1; j > i; j--) {

                if (arrayOfAnything.get(i).equals(arrayOfAnything.get(j))) {
                    break;
                }
            }

            if (j == i) {
                uniqueArray.add(arrayOfAnything.get(i));
            }

        }

        return uniqueArray;
    }


    private static ArrayList<String> toList(String[] array) {

        ArrayList<String> arrayToList = new ArrayList<>();
        for (String s : array) {

            arrayToList.add(s);
        }
        return arrayToList;
    }

    private static int countOccurance(ArrayList<String> animals, String findAnimal) {
        int counter = 0;

        for ( String animal : animals) {
            if (animal.equals(findAnimal)) {
                counter++;
            }
        }

        return counter;

    }
}

