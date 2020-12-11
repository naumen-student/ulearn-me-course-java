package com.example.task01;


public class Point {
    int x;
    int y;
    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }

    double distance(Point point){
        return Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
