package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isCollinearLine(Point p) {
        return p1.distance(p2) - p1.distance(p) - p2.distance(p) < 1e-9;
    }

    @Override
    public String toString() {
        return String.format("Line [Start: %s, End: %s], length: %f", p1, p2, p1.distance(p2));
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}
