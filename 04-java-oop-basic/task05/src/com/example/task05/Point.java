package com.example.task05;

public class Point {

    private final double X, Y;

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public double getX() {
        return this.X;
    }

    public double getY() {
        return this.Y;
    }

    public double getLength(Point point) {
        return Math.sqrt((point.X - this.X) * (point.X - this.X) + (point.Y - this.Y) * (point.Y - this.Y));
    }

}
