package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    void flip() {
        int z = x;
        x = -y;
        y = -z;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public String toString() {
        return String.format("{0}, {1}", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}