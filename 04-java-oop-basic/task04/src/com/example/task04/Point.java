package com.example.task04;

public class Point {
    final int x;
    final int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(((point.x - this.x) * (point.x - this.x)) + ((point.y - this.y) * (point.y - this.y)));
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
