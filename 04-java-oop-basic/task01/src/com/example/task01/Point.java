package com.example.task01;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int  a = -x;
        x = -y;
        y = a;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((point.x-x),2)+ Math.pow((point.y -y),2));
    }

    public String toString(){
        return "({x}, {y})";
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
