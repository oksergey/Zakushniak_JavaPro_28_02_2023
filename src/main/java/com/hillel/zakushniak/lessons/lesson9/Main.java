package main.java.com.hillel.zakushniak.lessons.lesson9;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard MacDonalds = new CoffeeOrderBoard();

        MacDonalds.add(new Order(4, "Serg"));
        MacDonalds.add(new Order(27, "Sasha"));
        MacDonalds.draw();

        MacDonalds.add(new Order(13, "Gordiy"));
        MacDonalds.draw();

        MacDonalds.add(new Order(34, "Nata"));
        MacDonalds.deliver();
        MacDonalds.add(new Order(35, "Kate"));
        MacDonalds.add(new Order(36, "Elen"));
        MacDonalds.draw();

        MacDonalds.deliver(35);
        MacDonalds.draw();


    }
}
