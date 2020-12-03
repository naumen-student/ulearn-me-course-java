package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int tmp = x;
        x = -y;
        y = -tmp;
    }

    double distance(Point point) {
        int dx = point.x - x;
        int dy = point.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
