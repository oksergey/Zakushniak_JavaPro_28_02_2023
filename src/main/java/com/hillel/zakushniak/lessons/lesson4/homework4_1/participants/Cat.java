package com.hillel.zakushniak.lessons.lesson4.homework4_1.participants;

import com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles.RunningTrack;
import com.hillel.zakushniak.lessons.lesson4.homework4_1.obstacles.Wall;

public class Cat extends Participant{
    public Cat(String name, int maxRunningDistance, int maxJumpingHieght) {
        super (name, maxRunningDistance, maxJumpingHieght);
    }

    @Override
    public void jump() {
        System.out.println(getName() + " jumped obstacle WALL with Height " + Wall.height);
    }

    @Override
    public void run() {
        System.out.println(getName() + " runned obstacle RunningTrack with Distance " + RunningTrack.length);
    }

}
