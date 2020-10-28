package com.example.task01;

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
        int age1=age;
        if (age1>=18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
