package org.example;

public class Cow extends Animal implements Function

{
    private String color;

    public Cow(){

    }

    public Cow(String eyes, String tail, String horns, String color) {
        super(eyes, tail, horns);
        this.color = color;
    }


    public String toString() {
        return "Cow{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

    public static String move(String a, String b) {
        return  a + b;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cow(String eyes, String tail, String horns) {
        super(eyes, tail, horns);
    }

    @Override
    public void move() {
        System.out.println("This animal walks and runs");

    }

    @Override
    public void eat() {

    }

    @Override
    public void sound() {

    }


    public static String  eat(String c, String d) {
        return c + d;

    }

    public static String sound(String e, String f) {
        return e + f;
    }
}
