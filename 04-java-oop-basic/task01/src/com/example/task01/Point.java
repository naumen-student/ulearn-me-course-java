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

    void flip() {
        int save = x;
        x = -y;
        y = -save;
    }

    double distance(Point point) {
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
