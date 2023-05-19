package com.hillel.zakushniak.lessons.lesson4.homework4_0;

public class Main {
    public static void main(String[] args) {

        GeometricFigure[] figures = {
                new Circle(5),
                new Triangle(3, 4),
                new Square(3),
        };

        double totalSquare = 0;

        for (GeometricFigure figure : figures) {
            totalSquare += figure.getSquare();

        }
        System.out.println("Square of all figures equals: " + totalSquare);

    }
}
