package org.example;

public class Rhino extends Animal implements Function {


    private int speed;

    public Rhino(String eyes, String tail, String horns, int speed) {
        super(eyes, tail, horns);
        this.speed = speed;
    }

    public static int speed() {
        return 2 * 50;
    }


    public String toString() {
        return "Rhino{" +
                "speed=" + speed +
                "} " + super.toString();
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sound() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

