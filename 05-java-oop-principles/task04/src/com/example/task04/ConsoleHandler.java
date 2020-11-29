package com.example.task04;


public class ConsoleHandler implements MessageHandler{

    Logger logger;

    public ConsoleHandler(Logger logger){
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
