package main.java.com.hillel.zakushniak.lessons.homework12_Roman_to_Integer;

public class Main2 {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MMMCMXCIX"));


    }


    public static int romanToInt(String s) {
        int result = 0;

        String newStr = s.replace("IV", "IIII")
                .replace("IX", "VIIII")
                .replace("XL", "XXXX")
                .replace("XC", "LXXXX")
                .replace("CD", "CCCC")
                .replace("CM", "DCCCC");

        for (int i = 0; i < newStr.length(); i++) {

            if (newStr.charAt(i) == 'M') {
                result += 1000;
                continue;
            }
            if (newStr.charAt(i) == 'D') {
                result += 500;
                continue;
            }
            if (newStr.charAt(i) == 'C') {
                result += 100;
                continue;

            }
            if (newStr.charAt(i) == 'L') {
                result += 50;
                continue;
            }
            if (newStr.charAt(i) == 'X') {
                result += 10;
                continue;
            }
            if (newStr.charAt(i) == 'V') {
                result += 5;
                continue;
            }
            if (newStr.charAt(i) == 'I') {
                result += 1;
            }
        }
        return result;
    }
}