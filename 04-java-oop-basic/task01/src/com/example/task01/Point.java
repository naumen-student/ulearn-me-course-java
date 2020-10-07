package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x, y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(toString());
    }

    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public String toString() {
        return String.format("(d, %%d)", x, y);
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
}
