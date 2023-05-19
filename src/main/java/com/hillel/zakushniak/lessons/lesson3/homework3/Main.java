package com.hillel.zakushniak.lessons.lesson3.homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("anagram");
        System.out.println("nagaram");
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println();

        System.out.println("rat");
        System.out.println("car");
        System.out.println(isAnagram("rat", "car"));
        System.out.println();

        System.out.println("rat");
        System.out.println("caret");
        System.out.println(isAnagram("rat", "ca"));
        System.out.println();
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] firstWord = s.toCharArray();
        char[] secondWord = t.toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        String firstWordSorted = new String(firstWord);
        String secondWordSorted = new String(secondWord);

        return firstWordSorted.equals(secondWordSorted);
    }


}
