package com.example.task05;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getLength(Point point) {
        double lenX = this.x - point.x;
        double lenY = this.y - point.y;
        return Math.sqrt(lenX*lenX + lenY*lenY);
    }

}
