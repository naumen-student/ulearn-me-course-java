package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString()
    {
        return String.format("(%d, %d), (%d, %d)", p1.x, p1.y, p2.x, p2.y);
    }

    public boolean isCollinearLine(Point p)
    {
        return (((p.x - p1.x) / (p2.x - p1.x)) == ((p.y - p1.y) / (p2.y - p1.y)));
    }
}
