package com.example.task04;
/**
 * Класс точки на плоскости
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(Math.abs(this.x - point.x),2) + Math.pow(Math.abs(this.y - point.y),2));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}