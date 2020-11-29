package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

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

    public boolean isCollinearLine(Point point){
        return (point.x - p1.x) * (point.y - p1.y) - (point.x - p2.x) * (point.y - p2.y) == 0;
    }

    public String toString(){
        return String.format("(%d, %d) - (%d, %d)", p1.x, p1.y, p2.x, p2.y);
    }
}

class Point {
    final  int x;
    final int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}