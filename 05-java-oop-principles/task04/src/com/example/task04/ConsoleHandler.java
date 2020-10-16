package com.example.task04;

public class ConsoleHandler implements MessageHandler{
    @Override
    public void logMessage(String msg) {
        System.out.println(msg);
    }
}
