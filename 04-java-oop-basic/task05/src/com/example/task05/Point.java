package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    private final double x;
    private  final double y;

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
        return (Math.sqrt((this.x - point.x) * (this.x - point.x)
                + (this.y - point.y) * (this.y - point.y)));
    }

}
