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
        int buffer = -x;
        x = -y;
        y = buffer;
    }

    double distance(Point point) {
        int lenX = this.x - point.x;
        int lenY = this.y - point.y;
        return Math.sqrt(lenX*lenX + lenY*lenY);
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

}
