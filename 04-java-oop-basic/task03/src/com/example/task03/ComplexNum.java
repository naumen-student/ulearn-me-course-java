package com.example.task03;

public class ComplexNum {
    private int integer, imagin;

    public ComplexNum(int integer, int imagin) {
        this.integer = integer;
        this.imagin = imagin;
    }

    public String toString(){
        return String.format("%d %fi", this.integer, this.imagin);
    }

    ComplexNum sum(ComplexNum num) {
        return new ComplexNum(this.integer + num.integer, this.imagin + num.imagin);
    }

    ComplexNum mult(ComplexNum num) {
        return new ComplexNum(this.integer * num.integer - this.imagin * num.imagin,
                this.imagin * num.integer + this.integer * num.imagin);
    }



}
