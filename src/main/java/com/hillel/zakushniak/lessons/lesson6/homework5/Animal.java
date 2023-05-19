package com.hillel.zakushniak.lessons.lesson6.homework5;

public class Animal {

    private String name;
    private int occurrence;

    public Animal(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }


    @Override
    public String toString() {
        return "\n " +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence;
    }
}
