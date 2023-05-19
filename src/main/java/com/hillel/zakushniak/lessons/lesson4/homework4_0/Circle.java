package com.hillel.zakushniak.lessons.lesson4.homework4_0;

public class Circle implements GeometricFigure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return 3.14*radius*radius;
    }
}
