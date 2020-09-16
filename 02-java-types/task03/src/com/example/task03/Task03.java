package com.example.task03;

import java.security.InvalidParameterException;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        if (centimetre<0)
            throw  new InvalidParameterException("value can't be less than 0");
        return centimetre/100;
    }

    public static void main(String[] args) {

    }

}
