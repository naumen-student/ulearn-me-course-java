package com.example.task04;

public class ConsoleHandler implements MessageHandler {
    public void log(String message){
        System.out.println(message);
    }
}