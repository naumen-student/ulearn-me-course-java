package com.example.task04;

public class Line {
    private Point p1, p2;

    public Line(){
        p1 = new Point();
        p2 = new Point();
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
        return String.format("P1: %s, P2 %s", p1, p2);
    }

    public boolean isCollinearLine(Point p) {
        return this.p1.x * (this.p2.y - p.y) +
                this.p2.x * (p.y - this.p1.y) +
                p.x * (this.p1.y - this.p2.y) == 0;
    }
}
