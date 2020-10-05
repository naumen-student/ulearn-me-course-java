package com.example.task04;

public class Vector {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double PseudoScalar(Vector vector) {
        return x * vector.getY() - y * vector.getX();
    }
}
