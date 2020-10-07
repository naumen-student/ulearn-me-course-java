package com.example.task05;
import java.util.ArrayList;

public class PolygonalLine
{
    private ArrayList<Point> List;

    public PolygonalLine()
    {
        this.List = new ArrayList<>();
    }

    public void setPoints(Point[] points)
    {
        for (Point point: points)
        {
            this.addPoint(point);
        }
    }

    public void addPoint(Point point)
    {
        List.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y)
    {
        List.add(new Point(x, y));
    }

    public double getLength()
    {
        double length = 0.0;
        for (int i = 0; i < this.List.size() - 1; i++)
        {
            length += this.List.get(i).getLength(this.List.get(i + 1));
        }
        return length;
    }
}