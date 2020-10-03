package com.example.task03;

public class ComplexNumber {
    private final double ReZ;
    private final double ImZ;

    public ComplexNumber(double ReZ, double ImZ) {
        this.ReZ = ReZ;
        this.ImZ = ImZ;
    }

    public double getReZ() {
        return ReZ;
    }

    public double getImZ() {
        return ImZ;
    }

    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(ReZ + number.ReZ, ImZ + number.ImZ);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        return new ComplexNumber(ReZ * number.ReZ, ImZ * number.ImZ);
    }
}
