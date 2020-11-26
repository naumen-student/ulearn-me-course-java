package com.example.task05;

public class Point {
    private double x, y;

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
        double X = point.x - x;
        double Y = point.y - y;
        return Math.sqrt(X * X + Y * Y);
    }

}
