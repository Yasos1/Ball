package com.company;

public class Ball {
    private String color;
    private String type;
    private int Radius;

    public Ball(String c, String t, int R) {
        color = c;
        type = t;
        Radius = R;
    }

    public Ball(String c, String t) {
        color = c;
        type = t;
        Radius = 0;
    }

    public void setRadius(int Radius) {
        this.Radius = Radius;
    }

    public void SetType(String type) {
        this.type = type;
    }

    public void setName(String color) {
        this.color = color;
    }

    public String getName(String name) {
        return name;
    }

    public int getRadius() {
        return Radius;
    }

    public String toString() {
        return "color:" + this.color + " Radius:" + this.Radius + " type:" + this.type;
    }
}
