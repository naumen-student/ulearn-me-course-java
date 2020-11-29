package com.example.task03;

public class Complex {
        private double imagiPart;
        private double realPart;

        public Complex(double realPart, double imagiPart) {
            this.imagiPart = imagiPart;
            this.realPart = realPart;
        }

        public com.example.task03.Complex sum(com.example.task03.Complex number){
            return new com.example.task03.Complex(realPart + number.realPart, imagiPart + number.imagiPart);
        }

        public com.example.task03.Complex multipl(com.example.task03.Complex number){
            return new com.example.task03.Complex( realPart * number.realPart - imagiPart * number.realPart, realPart * number.imagiPart + imagiPart* number.realPart);
        }

        public String tostring(){
            return String.format("%f, %f", realPart, imagiPart);
        }
    }


