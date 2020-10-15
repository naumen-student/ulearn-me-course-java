package com.example.task04;

public class ConsoleHandler implements MessageHandler{

    @Override
    public void outMessage(String message) {
        System.out.println(message);
    }
}


