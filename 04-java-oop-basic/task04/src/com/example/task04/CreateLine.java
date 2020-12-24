package com.example.task04;

public class Line {
    private Point P1;
    private Point P2;

    public Line(Point p1, Point p2) {
        P1 = p1;
        P2 = p2;
    }

    public Point getP1() {
        return P1;
    }

    public Point getP2() {
        return P2;
    }

    public String toString() {
        return P1.toString() + ' ' + P2.toString();
    }

    public boolean isCollinearLine(Point p) {
        return ((p.x - getP1().x) / (getP2().x - getP1().x) == (p.y - getP1().y) / (getP2().y - getP1().y));
    }
}