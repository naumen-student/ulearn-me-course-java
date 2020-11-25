package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        boolean a = canGetDriverLicense(100);
        boolean b = canGetDriverLicense(15);
        boolean c = canGetDriverLicense(19);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
         */
    }

    static boolean canGetDriverLicense(int age) {
        return age >= 18;
    }
}
