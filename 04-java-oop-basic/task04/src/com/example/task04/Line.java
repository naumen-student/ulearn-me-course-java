package com.example.task04;

import java.awt.*;

public class Line {
    Point p1, p2;

    public Line(){
        p1 = new Point(0, 0);
        p2 = new Point(0, 0);
    }

    public Line(double x1, double y1, double x2, double y2){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public String toString(){
        return p1.toString() + " " + p2.toString();
    }

    public boolean isCollinearLine(Point p){
        double vecX1 = getP1().x - p.x;
        double vecY1 = getP1().y - p.y;
        double vecX2 = getP2().x - p.x;
        double vecY2 = getP2().y - p.y;
        return Math.abs(vecX1 * vecY2 - vecX2 * vecY1) <= 1e-9;

    }
}
