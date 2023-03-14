package main.java.com.hillel.zakushniak.lessons.lesson4.homework4_1.participants;

public abstract class Participant {

    private String name;
    private int maxRunningDistance;
    private int maxJumpingHieght;

    public Participant(String name, int maxRunningDistance, int maxJumpingHieght) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingHieght = maxJumpingHieght;
    }

    public int getMaxRunningDistance() {
        return maxRunningDistance;
    }

    public int getMaxJumpingHieght() {
        return maxJumpingHieght;
    }

    public String getName() {
        return name;
    }

    public abstract void jump();

    public abstract void run();


}
