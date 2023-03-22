package main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles;

import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Participant;

public class RunningTrack extends Obstacle {

    public static int length = 100;

    @Override
    public void overcome(Participant participant) {
        if (participant.getMaxRunningDistance() < length) {
            System.out.println(participant.getName() + " can`t overcome RunningTrack with distance " + length
                    + ", he could run only for  " + participant.getMaxRunningDistance());
        } else participant.run();
    }
}
