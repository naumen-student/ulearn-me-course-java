package com.example.task04;

import java.awt.*;

public class Line{
    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2){
        point1 = p1;
        point2 = p2;
    }

    public Point getP1(){
        return point1;
    }

    public Point getP2(){
        return point2;
    }

    @Override
    public String toString(){
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    public boolean isCollinearLine(Point point){
        return point2.distance(point1) - point.distance(point1) - point.distance(point2) < 2e10;
    }
}
