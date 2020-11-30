package com.example.task04;

public class Line{
    private final Point p1;
    private final Point p2;

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
        return p1.toString()+' to '+p2.toString();
    }

    public boolean isCollinearLine(Point p){
        if ((p1.x - p2.x)/(p1.y - p2.y) == (p.x - p1.x)/(p.y - p1.y))
            return true;
        return false;
    }
}

public class Point {

    //int x;
    //int y;

    public Point(){};

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip() {
        int vr = x;
        x = -y;
        y = -vr;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(this.x- point.x,2) + Math.pow(this.y- point.y,2));
    }

    public String toString(){
        return String.format("{0}, {1})", x, y);
    }
}