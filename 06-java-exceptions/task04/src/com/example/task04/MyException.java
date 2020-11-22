package com.example.task04;

public class MyException extends IllegalArgumentException {
    public MyException() {
        super();
    }

    public MyException(String s) {
        super(s);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}