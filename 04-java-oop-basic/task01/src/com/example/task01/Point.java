package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public void flip(){
        int savedX = x;
        x=-y;
        y=-savedX;
    }
    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        return Math.sqrt((x-point.x)*(x- point.x) + (y- point.y)*(y- point.y));
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}