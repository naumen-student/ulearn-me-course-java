package com.example.task04;

public class Point {
    public final int x;
    public final int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
