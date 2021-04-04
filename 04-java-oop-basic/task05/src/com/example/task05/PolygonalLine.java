package com.example.task05;

public class PolygonalLine {

    private Point[] points;

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public void addPoint(Point point) {
        if(points != null) {
            Point[] temp = new Point[points.length + 1];
            for (int i = 0; i < points.length; i++)
                temp[i] = points[i];
            temp[temp.length - 1] = point;
            points = temp;
        }
    }

    public void addPoint(double x, double y) {
        addPoint(new Point(x,y));
    }

    public double getLength() {
        if(points == null) return 0;
        double result = 0;
        for(int i = 0; i < points.length - 1; i++){
            double temp = Math.sqrt(Math.pow(points[i+1].x - points[i].x,2) + Math.pow(points[i+1].y - points[i].y,2));
            result += temp;
        }
        return result;
    }

}

