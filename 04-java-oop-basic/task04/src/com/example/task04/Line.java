package com.example.task04;

import java.awt.*;

public class Line {
    private final Point p1;
    private final Point p2;


    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return (String.format("[%s,%s]", p1.toString(), p2.toString()));
    }

    public boolean isCollinearLine(Point p) {
        return (p1.x-p.x)/(p2.x-p.x) == (p1.y-p.y)/(p2.y-p.y);
    }
}
