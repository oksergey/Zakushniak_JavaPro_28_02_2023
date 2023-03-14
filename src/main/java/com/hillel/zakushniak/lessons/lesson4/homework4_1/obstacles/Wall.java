package main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles;

import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Participant;

public class Wall extends Obstacle {

    public static int height = 3;


    @Override
    public void overcome(Participant participant) {
        participant.jump();
    }
}
