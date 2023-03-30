package main.java.com.hillel.zakushniak.lessons.lesson8.homework6;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("--------Task #1");
        System.out.println("Is the string palindrome?");

        System.out.print('\"' + "A man, a plan, a canal: Panama" + '\"' + '\t');
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

        System.out.print('\"' + "race a car" + '\"' + '\t');
        System.out.println(isPalindrome("race a car"));

        System.out.print('\"' + "" + '\"' + '\t');
        System.out.println(isPalindrome(" "));

        System.out.println("--------Task #2");
        int[] nums1 = new int[]{1, 2, 3, 1};
        System.out.println(Arrays.toString(nums1));
        System.out.println(isElementsDistinct(nums1));

        int[] nums2 = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(nums2));
        System.out.println(isElementsDistinct(nums2));

        int[] nums3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(Arrays.toString(nums3));
        System.out.println(isElementsDistinct(nums3));

        System.out.println("--------Task #3");
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(nums) + " target = " + target);
        System.out.println(Arrays.toString(twoSum(nums, target)));

        nums = new int[]{3, 2, 4};
        target = 6;
        System.out.println(Arrays.toString(nums) + " target = " + target);
        System.out.println(Arrays.toString(twoSum(nums, target)));

        nums = new int[]{3, 3};
        target = 6;
        System.out.println(Arrays.toString(nums) + " target = " + target);
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    //Task 3. Second variant
    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> twoSum = new HashSet<>();
        int ind1;
        int ind2;

        for (ind2 = 0; ind2 < nums.length; ind2++) {
            if (twoSum.contains(target - nums[ind2])) {
                break;
            }
            twoSum.add(nums[ind2]);
        }

        for (ind1 = 0; ind1 < nums.length; ind1++) {
            if (nums[ind1] + nums[ind2] == target) break;
        }

        return new int[]{ind1, ind2};
    }
//Task 3. First variant
    public static int[] twoSumFirst(int[] nums, int target) {
        int[] numsCloned = nums.clone();

        Arrays.sort(numsCloned);
        int pointerToEnd = 0;
        int pointerToBegin = numsCloned.length - 1;

        while (pointerToEnd != pointerToBegin) {
            if ((numsCloned[pointerToEnd] + numsCloned[pointerToBegin]) == target) {
                break;
            }
            if ((numsCloned[pointerToEnd] + numsCloned[pointerToBegin]) > target) {
                pointerToBegin--;
            } else pointerToEnd++;
        }

        for (int pointerOrigNums = 0; pointerOrigNums < nums.length; pointerOrigNums++) {
            if (nums[pointerOrigNums] == numsCloned[pointerToEnd]) {
                pointerToEnd = pointerOrigNums;
                break;
            }
        }
        for (int pointerOrigNums = 0; pointerOrigNums < nums.length; pointerOrigNums++) {
            if (nums[pointerOrigNums] == numsCloned[pointerToBegin] && pointerOrigNums != pointerToEnd) {
                pointerToBegin = pointerOrigNums;
                break;
            }
        }
        return new int[]{pointerToEnd, pointerToBegin};
    }

    public static boolean isElementsDistinct(int[] nums) {
        Set<Integer> withoutDistincts = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (withoutDistincts.contains(nums[i])) {
                return true;
            }
            withoutDistincts.add(nums[i]);
        }
        return false;
    }

    public static boolean isPalindrome(String str) {

        String inLowerCase = str.toLowerCase();
        StringBuilder onlyLettersAndDigits = new StringBuilder();
        StringBuilder reversedLettersAndDigits = new StringBuilder();

        for (int i = 0; i < inLowerCase.length(); i++) {
            char c = inLowerCase.charAt(i);
            if (Character.isDigit(c) || Character.isLetter(c)) {
                onlyLettersAndDigits.append(c);
            }
        }
        for (int i = onlyLettersAndDigits.length() - 1; i >= 0; i--) {
            reversedLettersAndDigits.append(onlyLettersAndDigits.charAt(i));
        }

        return onlyLettersAndDigits.toString().equals(reversedLettersAndDigits.toString());
    }
}
