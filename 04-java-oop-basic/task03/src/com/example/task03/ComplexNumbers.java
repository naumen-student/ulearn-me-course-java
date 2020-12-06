package com.example.task03;

public class ComplexNumbers {
    private double ReZ;
    private double ImZ;
    public ComplexNumbers(double ReZ, double ImZ) {
        this.ReZ = ReZ;
        this.ImZ = ImZ;
    }

    public ComplexNumbers sum(ComplexNumbers number) {
        return new ComplexNumbers(ReZ + number.ReZ, ImZ + number.ImZ);
    }

    public ComplexNumbers multiply(ComplexNumbers number) {
        return new ComplexNumbers(ReZ * number.ReZ, ImZ * number.ImZ);
    }
}