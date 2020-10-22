package com.example.task04;

public class MyException extends IllegalArgumentException
{
    public  MyException(String message)
    {
        super(message);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
