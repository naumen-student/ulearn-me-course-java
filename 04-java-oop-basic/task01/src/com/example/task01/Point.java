package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public  Point(){
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        int value = y;
        y = -x;
        x = -value;
    }

    public double distance(Point point){
       return Math.sqrt((x - point.x) * (x - point.x)
               + (y - point.y) * (y - point.y));
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        System.out.println(toString());
    }
}
