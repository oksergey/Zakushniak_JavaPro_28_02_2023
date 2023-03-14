package main.java.com.hillel.zakushniak.lessons.lesson4.homework4_0;

public class Square implements GeometricFigure {

    private double sideOfSquare;

    public Square(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public double getSquare() {
        return sideOfSquare * sideOfSquare;
    }
}
