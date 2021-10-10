package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line l = new Line(new Point(1, 1), new Point(3, 3));
        System.out.println(l.toString());
        System.out.println(l.isCollinearLine(new Point(2,2)));
    }
}

class Line {
    private final Point Start;
    private final Point End;

    public Line(Point start, Point end) {
        Start = start;
        End = end;
    }

    public double getLength() {
        return Start.getDistance(End);
    }

    public boolean isCollinearLine(Point p) {
        return getLength() == p.getDistance(Start) + p.getDistance(End);
    }

    public Point getP1() {
        return Start;
    }

    public Point getP2() {
        return End;
    }

    public String toString() {
        return Start.toString() + ", " + End.toString();
    }
}

class Point {
    private final int X;
    private final int Y;

    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public double getDistance(Point p2) {
        int xDistance = Math.abs(X - p2.getX());
        int yDistance = Math.abs(Y - p2.getY());

        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    public String toString() {
        return "[" + X + ", " + Y + "]";
    }
}
