package com.example.task04;

public class ConsoleHandler implements MessageHandler{
    @Override
    public void handleLog(String log){
        System.out.println(log);
    }
}