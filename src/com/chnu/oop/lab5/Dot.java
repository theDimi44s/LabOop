package com.chnu.oop.lab5;

public class Dot {
    private double x;
    private double y;
    Dot()
    {
        this.x=0;
        this.y=0;
    }
    Dot(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
