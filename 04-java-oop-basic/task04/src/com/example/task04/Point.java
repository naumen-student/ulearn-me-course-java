package com.example.task04;

public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(Math.abs(this.x - point.x), 2) + Math.pow(Math.abs(this.y - point.y), 2));
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", this.x, this.y);
        System.out.println(pointToString);
    }

}

