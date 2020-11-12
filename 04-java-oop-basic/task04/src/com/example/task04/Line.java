package com.example.task04;

public class Line {
    private Point start;
    private  Point end;

    public  Line(Point start,Point end)
    {
        this.start=start;
        this.end=end;
    }

    public Point getP1()
    {
        return start;
    }

    public Point getP2()
    {
        return end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public boolean isCollinearLine(Point point)
    {
        return (point.x-start.x*1.0)/ (end.x- start.x)== (point.y- start.y*1.0)/ (end.y- start.y);
    }
}
