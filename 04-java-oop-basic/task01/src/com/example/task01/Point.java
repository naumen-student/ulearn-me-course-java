package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int t = x;
        x = -y;
        y = -t;
    }

    public double distance(Point point) {
        double d = Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
        return d;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
