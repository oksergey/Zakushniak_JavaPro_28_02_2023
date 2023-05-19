package com.hillel.zakushniak.lessons.lesson4.homework4_1;

import com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles.Obstacle;
import com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Cat;
import com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Human;
import com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles.RunningTrack;
import com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles.Wall;
import com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Participant;
import com.hillel.zakushniak.lessons.lesson4.homework4_1.participants.Robot;

public class Competition {
    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new Wall(),
                new RunningTrack()
        };

        Participant[] participants = {
                new Robot("Robot", 55, 1),
                new Human("Man", 111, 3),
                new Cat("Cat", 99, 2)
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.overcome(participant);
            }
        }
    }
}
