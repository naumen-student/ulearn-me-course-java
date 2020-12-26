package com.example.task04;

public class ConsoleHandler implements MessageHandler{
    @Override
    public void HandleMessage(String template, Object... messageArgs){
        System.out.println(String.format(template, messageArgs));
    }
}