package com.example.task01;

import java.security.InvalidParameterException;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        boolean b = canGetDriverLicense(100);
        System.out.println(b);
         */
    }

    static boolean canGetDriverLicense(int age) {
        if(age<=0)
            throw new InvalidParameterException("age<=0");
        return  age>=18;
    }
}
