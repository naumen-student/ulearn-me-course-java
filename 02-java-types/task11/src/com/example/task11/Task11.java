package com.example.task11;
import java.awt.geom.Rectangle2D;
import java.math.BigDecimal;

public class Task11 {

    public static float benefit(float sum, float percent) {
        return (float)(sum * Math.pow(1.0 + percent, 12));
    }

    public static void main(String[] args) {
    }

}
