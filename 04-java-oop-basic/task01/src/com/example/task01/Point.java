package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void flip(){
        x -= 2*x;
        y -= 2*x;
    }

    public double distance(Point p){
        return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
    }

    public String toString(){
        return String.format("%o, %o", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
