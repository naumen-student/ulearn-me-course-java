package com.example.task03;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public  void AddTest()
    {
        ComplexNumber constantNumber = new ComplexNumber(20,-10);

        ComplexNumber testNumber = constantNumber.Add(new ComplexNumber( -20,10));
        Assert.assertTrue(testNumber.complexPart==0 && testNumber.realPart==0);

        testNumber = constantNumber.Add(new ComplexNumber( 20,-10));

        Assert.assertTrue(testNumber.complexPart==-20 && testNumber.realPart==40);
    }

    @Test
    public  void MultiplyTest()
    {
        ComplexNumber constantNumber = new ComplexNumber(20,-10);

        ComplexNumber testNumber = constantNumber.Multiple(new ComplexNumber( 0,0));
        Assert.assertTrue(testNumber.complexPart==0 && testNumber.realPart==0);

        testNumber = constantNumber.Multiple(new ComplexNumber( 2,1));
        Assert.assertTrue(testNumber.realPart==50 && testNumber.complexPart==0);
    }

    @Test
    public  void Mix()
    {
        ComplexNumber constatntNumber = new ComplexNumber(20,-10);

        ComplexNumber testNumber = constatntNumber.Multiple(new ComplexNumber( 2,1));
        Assert.assertTrue(testNumber.realPart==50 && testNumber.complexPart==0);

        testNumber = testNumber.Add(new ComplexNumber( 0,50));
        Assert.assertTrue(testNumber.realPart==50 && testNumber.complexPart==50);
    }
}
