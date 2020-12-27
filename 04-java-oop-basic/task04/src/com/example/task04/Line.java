package com.example.task04;

public class Line {

    private Point startPoint;
    private Point endPoint;

    public Line(Point p1, Point p2){
        startPoint = p1;
        endPoint = p2;
    }

    public Point getP1() {
        return startPoint;
    }

    public Point getP2() {
        return endPoint;
    }

    public String toString(){
        return startPoint.toString() + " " + endPoint.toString();
    }

    public boolean isCollinearLine(Point p){

        if (p.y - startPoint.y / startPoint.y - endPoint.y ==
                p.x - startPoint.x / startPoint.x - endPoint.x)
            return true;

        return false;
    }
}
