package com.example.task04;

import java.awt.*;

public class Task04Main {
    private Point p1, p2;

    public Task04Main(Point p1, Point p2) {
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
        return String.format("P1:%s P2:%s", p1, p2);
    }

    public boolean isCollinear(Point p){
        return Math.abs(p1.distance(p2) - p1.distance(p) - p2.distance(p)) <= 0.00001;
    }
}