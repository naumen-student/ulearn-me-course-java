package com.example.task04;

public class Lines {

    private final Points p1;
    private final Points p2;

    public Lines(Points p1, Points p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Points getP1(){

        return p1;
    }

    public Points getP2(){
        return p2;
    }

    public String toString(){
        return String.format("(%d, %d)", p1, p2);
    }

    public boolean isCollinearLine(Points p){
        return (((p.getX() - p1.getX()) / (p2.getX() - p1.getX())) == ((p.getY() - p1.getY()) / (p2.getY() - p1.getY())));
    }
}
public class Points {

    private final int x;
    private final int y;

    public Points(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
public class Task04Main {
    public static void main(String[] args) {

        Points p1 = new Points (0, 0);
        Points p2 = new Points (1, 1);
        int px = p1.getX ();
        Lines line = new Lines (p1, p2);
        Boolean b = line.isCollinearLine (new Points (0, 1));
    }
}
}
