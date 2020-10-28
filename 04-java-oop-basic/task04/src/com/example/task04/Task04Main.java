package com.example.task04;

import java.awt.*;

public class Task04Main {
    public static void main(String[] args) {
    }
}

class Line{
    public Line (Point p1, Point p2){
        this.point1 = p1;
        this.point2 = p2;
    }

    private final Point point1;
    private final Point point2;

    public Point getP1(){
        return this.point1;
    }

    public Point getP2(){
        return this.point2;
    }

    public String toString(){
        return String.format("P1: "+ point1.toString()+ "\nP2: "+ point2.toString());
    }

    public boolean isCollinearLine(Point p){
        return (p.x - point1.x)/(point2.x - point1.x) == (p.y - point1.y) / (point2.y - point1.y);
    }
}
