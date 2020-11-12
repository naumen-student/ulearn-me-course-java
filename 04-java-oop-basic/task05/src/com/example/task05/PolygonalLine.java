package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;



public class PolygonalLine {
    private ArrayList<Point> Points = new ArrayList<Point>();

    public void setPoints(Point[] points) {
        for(Point point:points) {
            this.Points.add(new Point(point.getX(), point.getY()));
        }
    }


    public void addPoint(Point point) {
        this.Points.add(new Point(point.getX(),point.getY()));
    }

    protected void addPoint(double x, double y) {
        this.Points.add(new Point(x,y));
    }

    public double getLength() {
        double sum = 0;
        for (int i = 0; i < this.Points.size() - 1; i++) {
            sum += this.Points.get(i).getLength(this.Points.get(i+1));
        }
        return sum;
    }

}
