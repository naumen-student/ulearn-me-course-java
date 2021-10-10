package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    public void flip() {
        int tempX = -x;
        x = -y;
        y = tempX;
    }

    public double distance(Point p) {
        int xDistance = Math.abs(x - p.x);
        int yDistance = Math.abs(y - p.y);

        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
