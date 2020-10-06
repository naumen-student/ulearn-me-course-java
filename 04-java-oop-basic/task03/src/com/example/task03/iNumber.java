package com.example.task03;

public class iNumber {
    private double rPart;
    private double imPart;

    public class ComplexNumber {
        private double rPart;
        private double imPart;

        public ComplexNumber(double rPart, double imPart) {
            this.rPart = rPart;
            this.imPart = imPart;
        }

        public double getrPart() {return rPart;}

        public void setrPart(double rPart) {this.rPart = rPart;}

        public double getImPart() {return imPart;}

        public void setImPart(double imPart) {this.imPart = imPart;}

        public ComplexNumber add(ComplexNumber complexNumber) {
            return new ComplexNumber(rPart + complexNumber.rPart,
                    imPart + complexNumber.imPart);
        }

        public ComplexNumber multiplication(ComplexNumber complexNumber) {
            double newRPart = this.rPart * complexNumber.rPart - this.imPart * complexNumber.imPart;
            double newImPart = this.rPart * complexNumber.imPart + this.imPart * complexNumber.rPart;
            return new ComplexNumber(newRPart, newImPart);
        }
    }
}
