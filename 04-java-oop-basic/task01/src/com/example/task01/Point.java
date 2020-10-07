package com.example.task01;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int tempVar = x;
        x = -y;
        y = -tempVar;
    }

    double distance(Point point) {
        return Math.sqrt((Math.pow(point.x - this.x, 2)) + (Math.pow(point.y - this.y, 2)));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        System.out.println(toString());
    }
}
