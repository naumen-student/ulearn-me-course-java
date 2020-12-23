package com.example.task04.handlers;

public class ConsoleHandler implements MessageHandler
{

    public void execute(String message) {
        System.out.println(message);
    }
}
