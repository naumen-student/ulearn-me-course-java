package com.example.task04;


public class Line {
    private final Point p1;
    private final Point p2;

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

    @Override
    public String toString() {
        return String.format("P1P2: P1%1$, P2%2$", p1, p2);
    }

    public boolean isCollinearLine(Point p) {
        return (((double) (p1.getX() - p.getX())) / (p1.getX() - p2.getX())) == (((double) (p1.getY() - p.getY())) / (p1.getY() - p2.getY()));
    }

}
