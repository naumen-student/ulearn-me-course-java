package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int swap = x;
        x = - y;
        y = - swap;
    }

    double distance(Point point) {
        return (Math.sqrt(Math.pow((point.x - x), 2) + Math.pow((point.y - y), 2)));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
