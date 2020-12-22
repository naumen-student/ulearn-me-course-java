package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p) {
        return p1.distance(p2) - p1.distance(p) - p2.distance(p) < 1e-9;
    }

    public String toString() {
        return String.format("(%d,%d)(%d,%d)", p1.x, p1.y, p2.x, p2.y);
    }
}
