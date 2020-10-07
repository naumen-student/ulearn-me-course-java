package com.example.task01;

public class Point
{
    int x;
    int y;

    public Point()
    {

    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    void flip()
    {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point point)
    {
        return Math.sqrt((point.y - y) * (point.y - y) + (point.x - x) * (point.x - x));
    }

    public String toString()
    {
        return String.format("(%d, %d)", x, y);
    }

    void print()
    {
        String pointTostr = String.format("(%d, %d)", x, y);
        System.out.println(pointTostr);
    }
}
