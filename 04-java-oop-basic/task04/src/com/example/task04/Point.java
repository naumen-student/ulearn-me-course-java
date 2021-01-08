package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point flip(){
        return new Point(-y, -x);
    }

    public double distance(Point point){
        return Math.sqrt((point.x-x) * (point.x-x) + (point.y-y) * (point.y-y));
    }

    public String toString(){
        return  String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = toString();
        System.out.println(pointToString);
    }
}
