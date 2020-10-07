package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
}