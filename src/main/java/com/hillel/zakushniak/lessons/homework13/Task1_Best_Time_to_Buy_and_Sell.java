package main.java.com.hillel.zakushniak.lessons.homework13;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class Task1_Best_Time_to_Buy_and_Sell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(getMaxProfit(prices));

        int[] prices1 = {7, 6, 4, 3, 1};
        System.out.println(getMaxProfit(prices1));

        int[] prices2 = {2, 4, 1};
        System.out.println(getMaxProfit(prices2));

        int[] prices3 = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(getMaxProfit(prices3));

        int[] prices4 = {3};
        System.out.println(getMaxProfit(prices4));

    }

    //  Time Limit Exceeded
    public static int getMaxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;

        int maxProfit = 0;
        int day = 0;
        int i = prices.length - 1;

        do {
            maxProfit = Math.max(maxProfit, prices[i] - prices[day]);
            i--;

            if (i == day) {
                day++;
                i = prices.length - 1;
            }
        } while (day != i);

        return maxProfit;
    }

//Good var Without Time Limit
//    public static int getMaxProfit(int[] prices) {
//        if (prices.length == 1)
//            return 0;
//        int minPrice = Integer.MAX_VALUE;
//        int maxProfit = 0;
//
//        for (int i = 0;i < prices.length; i++) {
////            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//            } else if (prices[i] - minPrice > maxProfit) {
//                maxProfit = prices[i] - minPrice;
//            }
//        }
//        return maxProfit;
//    }
}