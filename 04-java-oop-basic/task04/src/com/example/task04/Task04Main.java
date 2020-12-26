package com.example.task04;

class Point {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%f %f)", x, y);
    }
}

class Line {
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

    public String toString() {
        return String.format("x1 = %.2f, y1 = %.2f; x2 = %.2f, y2 = %.2f",
                getP1().x, getP1().y, getP2().x, getP2().y);
    }

    public boolean isCollinearLine(Point p) {
        double a = getP1().y - getP2().y;
        double b = getP2().x - getP1().x;
        double c = getP1().x * getP2().y - getP2().x * getP1().y;
        return a * p.x + b * p.y + c == 0;
    }
}

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Line l = new Line(p1, p2);
        System.out.println(l.toString());
        System.out.println(l.isCollinearLine(new Point(2, 0)));
        System.out.println(l.isCollinearLine(new Point(2, 1)));
    }
}
