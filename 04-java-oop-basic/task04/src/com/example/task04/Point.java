package com.example.task04;

public class Point {

    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point point) {
        int lenX = this.x - point.x;
        int lenY = this.y - point.y;
        return Math.sqrt(lenX*lenX + lenY*lenY);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

}
