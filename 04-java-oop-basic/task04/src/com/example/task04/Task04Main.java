package com.example.task04;

class Point
{
    final int x;
    final int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return String.format("(%d; %d)", x, y);
    }
}

class Line
{
    private final Point p1;
    private final Point p2;
    private final double length;

    public Line(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.length = Math.sqrt((p1.x - p2.y) * (p1.x - p2.y) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    public Point getP1()
    {
        return p1;
    }
