package com.hillel.zakushniak.lessons.homework15_maven;

/**
 * Given a string text, you want to use the characters of text to form as many instances of the word
 * "balloon" as possible.
 * You can use each character in text at most once. Return the maximum number of instances that can
 * be formed.
 * Constraints:
 * text consists of lower case English letters only.
 */
public class Balloons {

    public static boolean hasNoUpperCase(String text) {
        boolean hasNoUpperCase = text.matches(".*[A-Z].*");
        if (hasNoUpperCase) {
            return true;
        }
        System.out.println("text should consists of lower case English letters only!");
        return false;
    }

    public static int maxNumberOfBalloons(String text) {

        int countB = 0;
        int countA = 0;
        int countL = 0;
        int countO = 0;
        int countN = 0;

        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case ('b') -> countB++;
                case ('a') -> countA++;
                case ('l') -> countL++;
                case ('o') -> countO++;
                case ('n') -> countN++;
            }
        }
        int[] charEntrance = {
                countB,
                countA,
                countL / 2,
                countO / 2,
                countN};

        int minEntrance = countB;
        for (int i : charEntrance) {
            if (i < minEntrance)
                minEntrance = i;
        }
        return minEntrance;
    }
}
