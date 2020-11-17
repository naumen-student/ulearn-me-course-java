package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    private Point getP1() {
        return p1;
    }

    private Point getP2() {
        return p2;
    }

    public String toString() {
        return String.format("(%d, %d), (%d, %d)", p1.x, p1.y, p2.x, p2.y);
    }

    public boolean isCollinearLine(Point p) {
        double dx1 = p2.x - p1.x;
        double dy1 = p2.y - p1.y;
        double dx = p.x - p1.x;
        double dy = p.y - p1.y;
        return Math.abs(dx / dx1 - dy / dy1) == 0;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

}
