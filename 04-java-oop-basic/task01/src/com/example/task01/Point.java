package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(int x, int y ){
        this.x = x;
        this.y = y;
    }

    void flip() {
        int buffer = x;
        x = -y;
        y = -buffer;
    }

    double distance(Point point) {
        int xDistance = point.x - x;
        int yDistance = point.y - y;
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        System.out.println(toString());
    }
}
