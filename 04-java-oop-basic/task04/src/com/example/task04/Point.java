package com.example.task04;

public class Point {
     final int x;
     final int y;

    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point point) {
        int lenghtX = this.x - point.x;
        int lenghtY = this.y - point.y;
        return Math.sqrt(lenghtX*lenghtX + lenghtY*lenghtY);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
