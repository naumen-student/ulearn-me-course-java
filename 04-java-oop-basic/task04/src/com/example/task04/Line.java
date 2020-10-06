package com.example.task04;

public class Line {
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
        return String.format("Line starting at %s, ending at %s, length is %f",
                this.p1, this.p2, this.p1.distance(this.p2));
    }

    public boolean isCollinearLine(Point p){
        int dx1 = this.p2.x - this.p1.x;
        int dy1 = this.p2.y - this.p1.y;

        int dx = p.x - this.p1.x;
        int dy = p.y - this.p1.y;

        return dx1 * dy - dx * dy1 == 0;
    }
}
