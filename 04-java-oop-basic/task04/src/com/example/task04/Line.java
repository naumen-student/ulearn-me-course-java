package com.example.task04;

public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public String toString() {
        return p1.toString() + " - " + p2.toString();
    }

    public boolean isCollinearLine(Point p) {
        float x = (float) (p.x - p1.x) / (p2.x - p1.x);
        float y = (float) (p.y - p1.y) / (p2.y - p1.y);
        return Math.abs(x - y) < 1e-4;
    }
}