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
    private Point p1;
    private Point p2;
    private double length;

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

    public Point getP2()
    {
        return p2;
    }

    public String toString()
    {
        return String.format("[%str, %str] - length: %str", p1.toString(), p2.toString(), length);
    }

    public boolean isCollinearLine(Point p)
    {
        int dx1 = p2.x - p1.x;
        int dy1 = p2.y - p1.y;
        int dx = p.x - p1.x;
        int dy = p.y - p1.y;
        int s = dx1 * dy - dx * dy1;
        return s == 0;
    }
}

