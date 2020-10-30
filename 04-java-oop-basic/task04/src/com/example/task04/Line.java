package com.example.task04;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {return point1;}

    public Point getPoint2() {return point2;}

    public String toString() {return point1.toString() + point2.toString();}

    public boolean isCollinearLine(Point point) {return (point.x - point1.x) * (point2.y - point1.y) == (point2.x - point1.x) * (point.y - point1.y);}
}
