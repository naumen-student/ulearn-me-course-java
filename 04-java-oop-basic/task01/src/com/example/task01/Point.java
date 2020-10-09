package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point() {}

    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int tmp = -x;
        x = -y;
        y = tmp;
    }

    double distance(Point point) {
        int lenghtX = this.x - point.x;
        int lenghtY = this.y - point.y;
        return Math.sqrt(lenghtX*lenghtX + lenghtY*lenghtY);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
