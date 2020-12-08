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
        int tX = x;
        x = -y;
        y = -tX;
    }

    public double distance(Point point) {
        return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y));
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    public void print() {
        System.out.println(toString());
    }
}
