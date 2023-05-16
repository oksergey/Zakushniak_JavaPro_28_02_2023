package com.hillel.zakushniak.lessons.homework15;

public class Jewels {
    public static int numJewelsInStones(String jewels, String stones) {

        if (jewels == null || stones == null)
            return 0;

        int counter = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) > -1) counter++;
        }
        return counter;
    }
}
