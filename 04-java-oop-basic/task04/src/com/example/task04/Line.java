package com.example.task04;

public class Line {

    private Point p1, p2;

    public Line(Point start, Point end) {
        this.p1 = start;
        this.p2 = end;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString(){
        return String.format("(%a,%b) (%c,%d)", p1.x, p1.y, p2.x, p2.y);
    }

    public boolean isCollinearLine(Point p){
        return (p.x - p1.x)/(p2.x - p1.x) == (p.y - p1.y)/(p2.y - p1.y);
    }
}
