package com.example.task05;
public class Task05Main
{
    public static void main(String[] args)
    {
        Point[] point =
                {
                new Point(1, 2),
                new Point(8, 9),
                new Point(11, 42)
                };
        PolygonalLine pointline = new PolygonalLine();
        pointline.setPoints(point);
        System.out.println(pointline.getLength());
    }
}
