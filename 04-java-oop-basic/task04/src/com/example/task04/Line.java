package com.example.task04;

public class Line {
    private Point start;
    private Point end;

    public Line(Point p1, Point p2) {
        start = p1;
        end = p2;
    }

    public Point getEnd() {
        return end;
    }

    public Point getStart() {
        return start;
    }

    public String toString() {
        return start.toString() + ", " + end.toString();
    }

    public boolean isCollinearLine(Point p) {
        Point vec = new Point(end.getX() - start.getX(), end.getY() - start.getY());
        double res = Math.abs((p.getX() - end.getX()) / (double)vec.getX() - (p.getY() - end.getY()) / (double)vec.getY());
        return res < Math.pow(10, -9);
    }
}
