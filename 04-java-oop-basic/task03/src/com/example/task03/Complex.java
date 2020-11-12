package com.example.task03;

public class Complex {
    private double x;
    private double y;

    public Complex(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public Complex sum(Complex number){
        return new Complex(x+number.x, y+number.y);
    }

    public Complex multiply(Complex number){
        return new Complex(x*number.x -y*number.y, y*number.x+x*number.y);
    }

    public String toString(){
        if (this.getY() >= 0)
            return (this.getX() + "+" + this.getY() + "i");
        else return (this.getX() + "" + this.getY() + "i");
    }

}
