package com.hillel.zakushniak.lessons.homework15;

import org.junit.jupiter.api.Test;

import static com.hillel.zakushniak.lessons.homework15.GoodPairs.numIdenticalPairs;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GoodPairsTest {
    //    Good if:   nums[i] == nums[j] and i < j

    @Test
    void testHaveGoodPairs() {
        int actual = numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        assertEquals(4, actual);
    }

    @Test
    void testGoodPairsAllMembersEquals() {
        int actual = numIdenticalPairs(new int[]{1, 1, 1, 1});
        assertNotEquals(4, actual);
    }

    @Test
    void testNoGoodPairs() {
        int actual = numIdenticalPairs(new int[]{1, 2, 3});
        assertEquals(0, actual);
    }

    @Test
    void testGoodPairsForNull() {
        int actual = numIdenticalPairs(null);
        assertEquals(0, actual);
    }
}
