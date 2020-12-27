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
        int a = x;
        x = -y;
        y = -a;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(x-point.x, 2) + Math.pow(y-point.y, 2));
    }

    public String toString() {
        return String.format("{0}, {1}", x,y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
