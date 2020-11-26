package com.example.task04;

public class Line {
    private final point_1;
    private final point_2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return String.format("(%d, %d)", p1, p2);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p) {
        return (((p.get_x() - p1.get_x()) / (p2.get_x() - p1.get_x())) == ((p.get_y() - p1.get_y()) / (p2.get_y() - p1.get_y())));
    }
}