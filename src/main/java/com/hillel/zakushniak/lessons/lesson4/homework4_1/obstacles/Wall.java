package main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles;

import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Participant;

public class Wall extends Obstacle {

    public static int height = 2;


    @Override
    public void overcome(Participant participant) {
        if (participant.getMaxJumpingHieght() < height) {
            System.out.println(participant.getName() + " can`t overcome WALL with Height " + Wall.height
                    + ", he could jump only for  " + participant.getMaxJumpingHieght());
        } else participant.jump();
    }
}
