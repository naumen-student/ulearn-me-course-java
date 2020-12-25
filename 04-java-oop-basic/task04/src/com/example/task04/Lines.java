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