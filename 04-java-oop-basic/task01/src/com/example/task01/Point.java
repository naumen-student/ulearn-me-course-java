package com.example.task01;

/**
 * Класс точки на плоскости
 */
public final class Point {
    public int x;
    public int y;

    public  Point()
    {}

    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public  void flip()
    {
        int temp=x;
        x=y*-1;
        y=temp*-1;
    }

    public  double distance(Point point)
    {
        return  Math.sqrt((point.x-x)*(point.x-x)+(point.y-y)*(point.y-y));
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
