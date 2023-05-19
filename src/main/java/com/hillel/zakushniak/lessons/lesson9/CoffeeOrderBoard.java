package com.hillel.zakushniak.lessons.lesson9;

import java.util.LinkedList;

public class CoffeeOrderBoard {

    LinkedList<Order> queue;

    public CoffeeOrderBoard() {
        this.queue = new LinkedList<>();
    }

    public void add(Order o) {
        if (queue.isEmpty() || o.getOrderNumber() > queue.getLast().getOrderNumber()) {
            queue.add(o);
        } else {
            System.out.println(o + " added in the tail as was late!" + "\n");
            o.setOrderNumber(queue.getLast().getOrderNumber() + 1);
            add(o);
        }
    }

    public void deliver() {
        System.out.println(queue.getFirst().getName() + " is delivered. Bone appetite!" + '\n');
        queue.removeFirst();
    }

    public void deliver(int orderNumber) {
        System.out.println();
        for (Order order : queue) {
            if (order.getOrderNumber() == orderNumber) {
                System.out.println(order.getName() + " is delivered. Bone appetite!" + '\n');
                queue.remove(order);
                break;
            }
        }
    }

    public void draw() {
        System.out.print("Num | Name");
        for (Order order : queue) {
            System.out.print(order.toString());
        }
        System.out.print('\n' + "-----------" + '\n');
    }
}
