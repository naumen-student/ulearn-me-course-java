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

    public Point(){

    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void flip(){
        int x = this.x, y = this.y;
        this.x = -y;
        this.y = -x;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(Math.abs(this.x - point.x),2) + Math.pow(Math.abs(this.y - point.y),2));
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}