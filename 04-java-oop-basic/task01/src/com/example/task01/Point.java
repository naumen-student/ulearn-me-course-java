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

    Point() {
        x = 0;
        y = 0;
    }

    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point) {
        int distanceBetweenX = x - point.x;
        int distanceBetweenY = y - point.y;
        return Math.sqrt(distanceBetweenX * distanceBetweenX + distanceBetweenY * distanceBetweenY);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
