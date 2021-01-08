package com.example.task04;


public class Point {
    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point flip() {
        return new Point(-y, -x);
    }

    double distance(Point point) {
        double distanceBetweenX = x - point.x;
        double distanceBetweenY = y - point.y;
        return Math.sqrt(distanceBetweenX * distanceBetweenX + distanceBetweenY * distanceBetweenY);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
