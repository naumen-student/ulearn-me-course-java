package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final int x;
    final int y;


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

    double distance(Point point){
        return Math.sqrt((point.x - this.x)*(point.x - this.x) + (point.y - this.y)*(point.y - this.y));
    }

    public String toString(){
        return String.format("(%s,%d)",this.x, this.y);
    }
}
