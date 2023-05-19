package com.hillel.zakushniak.lessons.lesson4.homework4_0;

public class Triangle implements GeometricFigure {

    private double heightOfTriangle;
    private double sideOfTriangle;

    public Triangle(double heightOfTriangle, double sideOfTriangle) {
        this.heightOfTriangle = heightOfTriangle;
        this.sideOfTriangle = sideOfTriangle;
    }

    @Override
    public double getSquare() {
        return heightOfTriangle * sideOfTriangle / 2;
    }
}
