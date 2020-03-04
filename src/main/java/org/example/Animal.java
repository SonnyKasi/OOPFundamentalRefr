package org.example;

public class Animal {
    private String eyes;
    private String tail,horns;

    public Animal(){

    }

    public Animal(String eyes, String tail, String horns) {
        this.eyes = eyes;
        this.tail = tail;
        this.horns = horns;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getHorns() {
        return horns;
    }

    public void setHorns(String horns) {
        this.horns = horns;
    }


    public String toString() {
        return "Animal{" +
                "eyes='" + eyes + '\'' +
                ", tail='" + tail + '\'' +
                ", horns='" + horns + '\'' +
                '}';
    }
}
