package com.example.task04;



 class Point {

   final int x;
   final   int y;

     public Point(int x, int y){
         this.x = x;
         this.y = y;
     }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}

class Line {
     private Point p1;
     private Point p2;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Line( Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public  String toString(){
        return "(" + p1.x + ";" +  p1.y + ")" + ":" +"(" + p2.x + ";" + p2.y +")";
    }

    public boolean isCollinearLine(Point p){
        return (((p.x - p1.x) * (p2.y - p1.y)) - ((p.y - p1.y) * (p2.x - p1.x))) == 0;
    }
}

public class Task04Main {
    public static void main(String[] args) {

    }
}
