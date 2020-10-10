package com.example.task04;

public class Line {
   private Point p1;
   private Point p2;

   public Line (Point p1,Point p2) {
       this.p1 = p1;
       this.p2 = p2;
   }

   Line () {

   }

    public Point getP1() {
       return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public String toString() {
       return "[" + p1 +"," + p2 + "]";
    }

    public boolean isCollinearLine(Point p) {
        double length = p1.distance(p2);
        double distanceToStart = p1.distance(p);
        double distanceToEnd = p.distance(p2);
        return length - (distanceToStart + distanceToEnd) == 0;
    }

}
