package com.example.task04;
public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(toString());
    }

    double distance(Point other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}