package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return this.p1;
    }
    public Point getP2(){
        return this.p2;
    }

    public String toString(){
        return String.format("%d ; %d",this.p1.toString(), this.p2.toString());
    }

    public boolean isCollinearLine(Point p){
        return (p.getX() - this.p1.getX())/(p.getY() - this.p1.getY()) == (this.p2.getX()-this.p1.getX())/(this.p2.getY() - this.p1.getY());
    }
}
