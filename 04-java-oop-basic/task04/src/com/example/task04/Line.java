package com.example.task04;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getP1() {
        return point1;
    }

    public Point getP2() {
        return point2;
    }

    public String toString() {
        return String.format("[%s , %s]", point1.toString(), point2.toString());
    }

    public boolean isCollinearLine(Point mPoint) {
        return (mPoint.x - point1.x) * (point2.y - point1.y) - (mPoint.y - point1.y) * (point2.x - point1.x) == 0;
    }
}