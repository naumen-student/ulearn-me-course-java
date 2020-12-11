package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
       Point p1 = new Point(1, 1);
       Point p2 = new Point(2, 2);
       Point p3 = new Point(3, 3);
       Line line = new Line(p1, p2);
       System.out.println(line.isCollinear(p3));
       Point p4 = new Point(2, 3);
       System.out.println(line.isCollinear(p4));
    }
}

class Point {
    final int x;
    final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}

class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString(){
        return String.format("Point 1: %s, Point 2: %s", p1.toString(), p2.toString());
    }

    public boolean isCollinear(Point p) {
        return 0.5 * ((p1.x * p2.y + p2.x * p.y + p.x * p1.y) - ( p2.x * p1.y + p.x * p2.y + p1.x * p.y)) == 0;
    }
}
