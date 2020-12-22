package com.example.task04;

public class Line {
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

    public String toString(){
        return firstPoint.toString() + ", " + secondPoint.toString();
    }

    public boolean isCollinearLine(Point p){
        return (p.x-firstPoint.x) * (secondPoint.y-firstPoint.y)
                - (p.y-firstPoint.y) * (secondPoint.x-firstPoint.x) == 0;
    }
}
