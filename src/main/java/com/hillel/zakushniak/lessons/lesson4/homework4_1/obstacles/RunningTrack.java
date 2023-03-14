package main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles;

import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Participant;

public class RunningTrack extends Obstacle{

    public static int length = 100;

    @Override
    public void overcome(Participant participant) {
    participant.run();
    }
}
