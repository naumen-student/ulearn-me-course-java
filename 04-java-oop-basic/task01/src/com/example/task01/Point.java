package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point createPoint(int x, int y){
        return new Point(x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip(){
        int num = this.x;
        this.x = -this.y;
        this.y = -num;
    }

    double distance(Point point){
        return Math.sqrt((point.x - this.x)*(point.x - this.x) + (point.y - this.y)*(point.y - this.y));
    }

    public String toString(){
        return String.format("(%s,%d)",this.x, this.y);
    }
}
