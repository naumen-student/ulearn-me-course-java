package com.example.task01;

public class Point {
    int x;
    int y;

    public Point(){ }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void flip()
    {
        int z=x;
        x = -y;
        y = -z;
    }

    double distance(Point point)
    {
        return Math.sqrt((point.x - x)*(point.x - x) + (point.y - y)*(point.y - y));
    }

    public String toString()
    {
        return String.format("(%d %d)", x, y);
    }

    void print()
    {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
