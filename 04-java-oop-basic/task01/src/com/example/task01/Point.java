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

    public void flip() {
        int t = this.x;
        this.x = -this.y;
        this.y = -t;
    }

    public double distance(Point point) {
        int dx = this.x - point.x;
        int dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}