package com.example.task04;

public class ConsoleHandler extends MessageHandler {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}