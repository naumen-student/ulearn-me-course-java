package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line() {
        this(new Point(), new Point());
    }

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
        int dx1 = p2.x - p1.x;
        int dy1 = p2.y - p1.y;

        int dx = p.x - p1.x;
        int dy = p.y - p1.y;

        int s = dx1 * dy - dx * dy1;
        return s == 0;
    }

    @Override
    public String toString() {
        return "Line: " + p1 + " " + p2;
    }
}