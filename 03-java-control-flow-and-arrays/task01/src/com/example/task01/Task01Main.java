package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        System.out.println("A" + ('\t' + '\u0003') );
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        boolean b = canGetDriverLicense(100);
        System.out.println(b);
         */
    }

    static boolean canGetDriverLicense(int age) {
        return age >= 18;
    }
}
