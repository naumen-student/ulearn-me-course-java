package com.example.task04;

public class Line {
    private final Point P1;
    private final Point P2;
    private final double length;

    public Line (Point P1, Point P2){
        this.P1 = P1;
        this.P2 = P2;
        this.length = P1.distance(P2);
    }

    public Point getP1(){
        return P1;
    }

    public Point getP2() {
        return P2;
    }

    public boolean isCollinearLine(Point point){
        return (P2.x - P1.x) * (point.y - P1.y) -
                (point.x - P1.x) * (P2.y - P1.y)
                == 0;
    }

    public String toString() {
        return String.format("Line: P1%1$, P2%2$", P1, P2);
    }
}
