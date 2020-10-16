package com.example.task05;


public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLength(Point point) {
        double lenghtX;
        lenghtX = this.x - point.x;
        double lenghtY;
        lenghtY = this.y - point.y;
        return Math.sqrt(lenghtX * lenghtX + lenghtY * lenghtY);
    }

}
