package com.example.task04;

public final class Point {
    public final int x;
    public final  int y;

    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
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