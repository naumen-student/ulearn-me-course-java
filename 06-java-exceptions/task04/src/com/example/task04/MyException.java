package com.example.task04;

public class MyException extends IllegalArgumentException {

    private final int invalidMonth;

    public MyException(int invalidMonth){
        this.invalidMonth = invalidMonth;
    }

    public String getMessage(){
        return String.format("monthNumber %d is invalid, month number should be between 1..12", invalidMonth);
    }
}
