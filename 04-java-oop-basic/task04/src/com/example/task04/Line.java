package com.example.task04;

public class Line {

    private final Point p1, p2;

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

    public boolean isCollinearLine(Point p){
        return (double)(p.x - p1.x) / (p2.x - p1.x) ==
                (double)(p.y - p1.y) / (p2.y - p1.y);
    }

    public String toString(){
        return String.format("%s--%s", p1.toString(), p2.toString());
    }

}

class Point{

    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return String.format("(%d , %d)", x, y);
    }

}
