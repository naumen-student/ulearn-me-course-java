package com.example.task05;

public class PolygonalLine {

    public Point[] points;

    public void setPoints(Point[] points) {
        Point[] newPoints = new Point[points.length];
        for(int i = 0; i < points.length; i++){
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        this.points = newPoints;
    }

    public void addPoint(Point point) {
        Point[] newPoints;
        if(points == null){
            newPoints = new Point[]{new Point(point.getX(), point.getY())};
            this.setPoints(newPoints);
            return;
        }
        else
            newPoints = new Point[points.length + 1];
        for(int i = 0; i < points.length; i++){
            newPoints[i] = new Point(points[i].getX(), points[i].getY());
        }
        newPoints[points.length] = point;
        this.setPoints(newPoints);
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for(int i = 1; i < points.length; i++){
            length += points[i - 1].getLength(points[i]);
        }
        return length;
    }

}
