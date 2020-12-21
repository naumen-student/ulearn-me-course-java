package com.example.task01;

public class Point {
    int x;
    int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(toString());
    }

    void flip() {
        int temporary = x;
        x = -y;
        y = -temporary;
    }

    double distance(Point other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
