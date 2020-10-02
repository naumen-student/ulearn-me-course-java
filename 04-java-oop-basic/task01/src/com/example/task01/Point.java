package com.example.task01;

public class Point {
    private int x;
    private int y;

    void flip() {
        int temp = x;
        x = - y;
        y = - temp;
    }

    double distance(Point point) {
        return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
