package main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1;

import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles.Obstacle;
import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles.RunningTrack;
import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles.Wall;
import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Cat;
import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Human;
import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Participant;
import main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Robot;

public class Competition {
    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new Wall(),
                new RunningTrack()
        };

        Participant[] participants = {
                new Robot("Ilon", 55, 1),
                new Human("Man", 111, 3),
                new Cat("Murchik", 99, 5)
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.overcome(participant);
            }

        }

    }
}
