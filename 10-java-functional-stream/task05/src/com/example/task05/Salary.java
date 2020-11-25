package com.example.task05;

public class Salary extends IMessage<Integer>{

    public Salary(String from, String to, Integer content) {
        super(from, to, content);
    }
}
