package com.example.task05;


public class PolygonalLine {

    private Point[] points = new Point[0];

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++)
            this.points[i] = new Point(points[i].getX(), points[i].getY());

    }


    public void addPoint(Point point) {
        if( points == null )
            return;
        Point[] newPoints = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++)
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        newPoints[newPoints.length - 1] = new Point(point.getX(), point.getY());
        points = newPoints;

    }

    public void addPoint(double x, double y) {
        if( points == null )
            return;
        Point[] newPoints = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++)
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        newPoints[newPoints.length - 1] = new Point(x, y);
        points = newPoints;
    }


    public double getLength() {
        double result = 0;
        if( points == null || points.length < 2)
            return 0;
        for (int i = 1; i < points.length; i++)
            result += points[i - 1].getLength(points[i]);
        return result;
    }

}