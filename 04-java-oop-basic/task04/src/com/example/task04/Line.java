package com.example.task04;

public class Line {
    private final Point firstPoint;
    private final Point secondPoint;

    public Line(Point firstPoint, Point secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point getP1(){
        return firstPoint;
    }

    public Point getP2(){
        return secondPoint;
    }

    public boolean isCollinearLine(Point point){
        return (point.x - firstPoint.x) * (secondPoint.y - firstPoint.y) == (secondPoint.x - firstPoint.x) * (point.y - firstPoint.y);
    }

    public String toString(){
        return firstPoint.toString() + secondPoint.toString();
    }
}
