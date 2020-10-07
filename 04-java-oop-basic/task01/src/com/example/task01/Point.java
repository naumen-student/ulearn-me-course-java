package com.example.task01;

public class Point {
    int x;
    int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(this);
    }

    public void flip() {
        int tempX = x;
        x = -y;
        y = -tempX;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
