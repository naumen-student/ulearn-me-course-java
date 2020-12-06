package com.example.task04;

public class Line {
    private Point P1;
    private Point P2;
    public Point getP1() {
        return P1;
    }

    public Point getP2() {
        return P2;
    }

    public Line(Point P1, Point P2) {
        this.P1 = P1;
        this.P2 = P2;
    }

    public String toString() {
        return String.format("(%d, %d), (%d, %d)", P1.x, P1.y, P2.x, P2.y);
    }

    public boolean isCollinearLine(Point P) {
        double dx1 = P2.x - P1.x;
        double dy1 = P2.y - P1.y;
        double dx = P.x - P1.x;
        double dy = P.y - P1.y;
        return Math.abs(dx / dx1 - dy / dy1) == 0;
    }
}