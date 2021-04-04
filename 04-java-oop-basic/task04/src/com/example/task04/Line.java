package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public String toString() {
        try {
            double m = (double) (p1.y - p2.y) / (p1.x - p2.x);
            double b = p1.y - m * p1.x;
            return "y = " + m + "x + " + b;
        } catch (Exception e)
        {
            return "x = " + p1.x;
        }
    }

    public boolean isCollinearLine(Point p){
        double m = (double) (p1.y - p2.y) / (p1.x - p2.x);
        double b = p1.y - m * p1.x;
        return p.y == m * p.x + b;
    }
}