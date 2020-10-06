package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public String toString() {
        return String.format("P1(%d, %d), P2(%d, %d)", this.p1.x, this.p1.y, this.p2.x, this.p2.y);
    }

    public boolean isCollinearLine(Point p) {
        return (p.x - this.p1.x) * (this.p2.y - this.p1.y) - (p.y - this.p1.y) * (this.p2.x - this.p1.x) == 0;
    }

}
