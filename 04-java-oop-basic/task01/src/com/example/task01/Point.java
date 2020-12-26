package com.example.task01;

public class Point {
    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
    int x;
    int y;

    public void flip(){
        int temp = this.x;
        this.x = - this.y;
        this.y = - temp;
    }

    public double distance(Point point){
        double dx = Math.pow (point.x - this.x, 2);
        double dy = Math.pow (point.y - this.y, 2);
        return Math.sqrt (dx + dy);
    }

    public String toString(){
        return String.format ("{0}, {1}", this.x, this.y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
