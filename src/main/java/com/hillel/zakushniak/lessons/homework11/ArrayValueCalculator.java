package main.java.com.hillel.zakushniak.lessons.homework11;

import static java.lang.Integer.parseInt;

public class ArrayValueCalculator {

    static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;

        if (array.length == 4 && array[0].length == 4) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum = sum + parseInt(array[i][j]);
                    } catch (NumberFormatException formatException) {
                        throw new ArrayDataException("Cell [" + i + "][" + j + "] don`t contain Int!");
                    }
                }
            }

        } else {
            throw new ArraySizeException("Wrong array size!");
        }

        return sum;
    }
}
