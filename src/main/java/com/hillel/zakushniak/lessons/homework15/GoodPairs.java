package com.hillel.zakushniak.lessons.homework15;

public class GoodPairs {
//      Good if:   nums[i] == nums[j] and i < j

    public static int numIdenticalPairs(int[] nums) {
        if (nums == null) return 0;

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
}
