package com.example.task05;

public class PolygonalLine {

    private Point[] points;

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public void addPoint(Point point) {
        Point[] newPoints = new Point[points.length+1];
        for (int i = 0; i < points.length; i++) newPoints[i] = points[i];
        newPoints[newPoints.length - 1] = point;
        this.points = newPoints;
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++){
            length += points[i].getLength(points[i + 1]);
        }
        return length;
    }

}
