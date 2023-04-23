package main.java.com.hillel.zakushniak.lessons.homework12_Roman_to_Integer;

public class Main {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));

    }


    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); ) {


            if ((s.length() - i) >= 2) {
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    result += 900;
                    i += 2;
                    continue;
                }
            }

            if (s.charAt(i) == 'M') {
                result += 1000;
                i++;
                continue;
            }

            if ((s.length() - i) >= 2) {
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    result += 400;
                    i += 2;
                    continue;
                }
            }

            if (s.charAt(i) == 'D') {
                result += 500;
                i++;
                continue;
            }


            if ((s.length() - i) >= 2) {
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    result += 90;
                    i += 2;
                    continue;
                }
            }

            if (s.charAt(i) == 'C') {
                result += 100;
                i++;
                continue;
            }

            if ((s.length() - i) >= 2) {
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    result += 40;
                    i += 2;
                    continue;
                }
            }

            if (s.charAt(i) == 'L') {
                result += 50;
                i++;
                continue;
            }

            if ((s.length() - i) >= 2) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    result += 9;
                    i += 2;
                    continue;
                }
            }

            if (s.charAt(i) == 'X') {
                result += 10;
                i++;
                continue;
            }

            if ((s.length() - i) >= 2) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    result += 4;
                    i += 2;
                    continue;
                }
            }

            if ((s.length() - i) >= 2) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    result += 4;
                    i += 2;
                    continue;
                }
            }

            if (s.charAt(i) == 'V') {
                result += 5;
                i++;
                continue;
            }

            if (s.charAt(i) == 'I') {
                i++;
                result += 1;
            }

        }

        return result;
    }
}
