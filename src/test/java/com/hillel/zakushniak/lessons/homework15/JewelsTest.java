package com.hillel.zakushniak.lessons.homework15;

import org.junit.jupiter.api.Test;

import static com.hillel.zakushniak.lessons.homework15.Jewels.numJewelsInStones;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsTest {
    @Test
    void testHaveJewels() {
        int value = numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, value);
    }

    @Test
    void testNoJewels() {
        int value = numJewelsInStones("aABbCc", "DfjfkgjuKGEJDL");
        assertEquals(0, value);
    }

    @Test
    void testOneJewel() {
        int value = numJewelsInStones("a", "ZassfdsytAZ");
        assertEquals(1, value);
    }

    @Test
    void testOneStone() {
        int value = numJewelsInStones("ZassfdsytAZ", "a");
        assertEquals(1, value);
    }

    @Test
    void testEmptyStone() {
        int value = numJewelsInStones("dzfmh", "");
        assertEquals(0, value);
    }

    @Test
    void testEmptyJewels() {
        int value = numJewelsInStones("", "dzfmh");
        assertEquals(0, value);
    }

    @Test
    void testForNull() {
        int value = numJewelsInStones(null, null);
        assertEquals(0, value);
    }
}
