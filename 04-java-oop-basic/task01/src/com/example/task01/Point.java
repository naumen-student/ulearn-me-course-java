package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(toString());
    }

    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
}
