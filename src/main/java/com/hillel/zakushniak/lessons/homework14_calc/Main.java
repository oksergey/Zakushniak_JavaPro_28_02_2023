package com.hillel.zakushniak.lessons.homework14_calc;

public class Main {
    public static void main(String[] args)

    {
        if (args.length != 3) {
            System.out.println("Invalid arguments");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        String operation = args[1];
        int num2 = Integer.parseInt(args[2]);

        int result;
        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.err.println("Error! Division by zero");
                    return;
                }
                result = num1 / num2;
            }
            default -> {
                System.out.println("Invalid operation");
                return;
            }
        }

        System.out.println("Result: " + result);
    }
}
