package com.example.task04;

public class Line {
    private Point P1;
    private Point P2;

    public Line(Point firstPoint, Point secondPoint) {
        this.P1 = firstPoint;
        this.P2 = secondPoint;
    }

    public boolean isCollinearLine(Point p) {
        return (P1.getY() - P2.getY()) * p.getX() + (P2.getX() - P1.getX()) * p.getY() + P1.getX() * P2.getY() - P2.getX() * P1.getY() == 0;
    }

    public Point getP1() {
        return P1;
    }

    public Point getP2() {
        return P2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "P1=" + P1.toString() +
                ", P2=" + P2.toString() +
                '}';
    }
}
