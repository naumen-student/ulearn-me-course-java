package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    void flip() {
        int oldX = x;
        x = -y;
        y = -oldX;
    }

    double distance(Point point) {
        int a = Math.abs(x - point.x);
        int b = Math.abs(y - point.y);
        return Math.sqrt(a * a + b * b);
    }

    public String toString() {
        return String.format("(%s,%d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
