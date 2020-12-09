package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point point) {
        return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
    }

    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
