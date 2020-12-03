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

    public boolean isCollinear(Point point) {
        int dx1 = p2.getX() - p1.getX();
        int dy1 = p2.getY() - p1.getX();

        int dx = point.getX() - p1.getX();
        int dy = point.getY() - p1.getY();
        
        return dx1 * dy - dx * dy1 == 0;
    }
}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
