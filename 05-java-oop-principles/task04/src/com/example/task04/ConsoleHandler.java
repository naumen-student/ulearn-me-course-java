package com.example.task04;

public class ConsoleHandler implements MessageHandler {
    @Override
    public void handlerLog(String message) {
        System.out.println(message);
    }
}
