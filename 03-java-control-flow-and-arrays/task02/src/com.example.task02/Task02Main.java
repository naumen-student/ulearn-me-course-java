package com.example.task02;

public class Task02Main {
    public static void main(String[] args)
    {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
        System.out.println(getSeason(11));
    }

    static String getSeason(int monthNumber)
    {
        return "";//todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (monthNumber == 12 || monthNumber >=1 && monthNumber <=3 )
        {
            return "Зима";
        }
        else if (monthNumber >=4 && monthNumber <=6 )
        {
            return "Весна";
        }
        else if (monthNumber >=7 && monthNumber <=9 )
        {
            return "Лето";
        }
        else
        {
            return "Осень";
        }
    }
}