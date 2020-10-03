package com.example.task03;

public class ComplexNumber {
    public   Integer realPart;
    public  Integer complexPart;

    public  ComplexNumber(Integer realPart, Integer complexPart)
    {
        this.realPart=realPart;
        this.complexPart=complexPart;
    }

    public  ComplexNumber Add(ComplexNumber value)
    {
        return
            new ComplexNumber(realPart+value.realPart, complexPart+value.complexPart);
    }

    public  ComplexNumber Multiple(ComplexNumber value)
    {
        Integer newRealPart = realPart*value.realPart-complexPart*value.complexPart;
        Integer newComplexPart = realPart*value.complexPart+value.realPart*complexPart;
        return  new ComplexNumber(newRealPart, newComplexPart);
    }

    @Override
    public String toString() {
        return   String.valueOf(realPart) + complexPart +"i";
    }
}
