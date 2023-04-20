package main.java.com.hillel.zakushniak.lessons.homework11;

public class ArrayValueCalculator {

    static int doCalc(String[][] array) throws ArraySizeException {
        int sum = 0;

        if (array.length == 4 && array[0].length == 4) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException formatException) {
                        try {
                            throw new ArrayDataException("Cell [" + i + "][" + j + "] is ignored as don`t contain Int!");
                        } catch (ArrayDataException exception) {
                            System.err.println(exception);
                        }
                    }
                }
            }

        } else {
            throw new ArraySizeException("Wrong array size!");
        }

        return sum;
    }
}
