package com.example.task04;

public class Task04Main{

    static String getSeason(int monthNumber){
        if ( monthNumber < 1 || monthNumber > 12 )
            throw new MyException(
                    String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        if ( monthNumber / 3 == 1 )
            return "весна";
        if ( monthNumber / 3 == 2 )
            return "лето";
        if ( monthNumber / 3 == 3 )
            return "осень";
        return "зима";
    }

}