package com.example.task04;

public class Point {

    final int x;
    final int y;

    public Point(int x, int y) {
        this.y = y;
        this.x = x;
    }

    void print(){
        String pointToString = String.format("(%d, %d)", x,y);
        System.out.println(pointToString);
    }

    double distance(Point point){
        return Math.sqrt((x - point.x)*(x - point.x)+(y- point.y)*(y-point.y));
    }

    public String toString(){
        return String.format("(%d, %d)", x,y);
    }
}