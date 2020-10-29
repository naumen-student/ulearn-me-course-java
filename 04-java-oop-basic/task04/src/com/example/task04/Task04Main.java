package com.example.task04;

class Point {
    int x;
    int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int previousX = x;
        this.x = -y;
        this.y = -previousX;
    }

    public double distance(Point point) {
        return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point p1() {
        return p1;
    }

    public Point p2() {
        return p2;
    }

    public String toString() {
        return String.format("(%d, %d), (%d, %d)", p1.x, p1.y, p2.x, p2.y);
    }

    public boolean isCollinearLine(Point p) {
        return ((p.x - p1.x) * (p2.y - p1.y) - (p.y - p1.y) * (p2.x - p1.x) < 1e-5)
                && ((p1.x < p.x && p.x < p2.x) || (p2.x < p.x && p.x < p1.x));
    }
}

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(0, 5);
        Line line = new Line(p1, p2);
        System.out.println(line);
        System.out.println(line.isCollinearLine(new Point( 1,5)));
    }
}