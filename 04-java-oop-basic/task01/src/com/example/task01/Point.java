package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int positionY = y;
        int positionX = x;
        x = -positionY;
        y = -positionX;
    }

    double distance(Point point) {
        int positionX = x - point.x;
        int positionY = y - point.y;
        return Math.sqrt(positionX * positionX + positionY * positionY);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

}
