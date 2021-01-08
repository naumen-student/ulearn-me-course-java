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
        return "point1 : " + point1 + " point2 : " + point2 +
                " distance : " + point1.distance(point2);
    }

    public boolean isCollinearLine(Point p) {
        return (point1.x - point2.x) * (point1.y - p.y) == (point1.x - p.x) * (point1.y - point2.y);
    }
}
