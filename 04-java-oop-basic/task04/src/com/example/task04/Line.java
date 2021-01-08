package com.example.task04;

public class Line {
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    private final Point p1;
    private final Point p2;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinear(Point p) {
        final double dx1 = p2.x - p1.x;
        final double dy1 = p2.y - p1.y;
        final double dx = p.x - p1.x;
        final double dy = p.y - p1.y;
        return Math.abs(dx / dx1 - dy / dy1) < 1e-4;
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
