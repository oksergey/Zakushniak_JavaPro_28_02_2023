package main.java.com.hillel.zakushniak.lessons.lesson2.homework2;

public class Car {

    public void start() {

        startElectricity();
        startCommand();
        startFuelSystem();


    }


    private void startElectricity() {
        System.out.println("electricity started");

    }

    private void startCommand() {
        System.out.println("command started");
    }

    private void startFuelSystem() {
        System.out.println("fuelSystem started");
    }

}
