package com.example.task04;

public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1,Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public boolean isCollinearLine(Point p){
        return Math.abs((double) (p.x - p1.x) / (p2.x - p1.x) - (double) (p.y - p1.y) / (p2.y - p1.y)) < 1e-4;
    }

    public String toString(){
        return String.format("Endpoint1: p1(%d, %d); Endpoint2: p2(%d, %d)", p1.x, p1.y, p2.x, p2.y);
    }
}
