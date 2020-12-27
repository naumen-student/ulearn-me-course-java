package com.example.task04;

import java.awt.*;

public class Line{

    private Point firstPoint;
    private Point secondPoint;

    public Line(Point p1, Point p2){
        firstPoint = p1;
        secondPoint = p2;
    }

    public Point getP1(){
        return firstPoint;
    }

    public Point getP2(){
        return secondPoint;
    }

    @Override
    public String toString(){
        return "Line{" +
                "point1=" + firstPoint +
                ", point2=" + secondPoint +
                '}';
    }

    public boolean isCollinearLine(Point point){
        return secondPoint.distance(firstPoint) - point.distance(firstPoint) - point.distance(secondPoint) < 2e10;
    }
}