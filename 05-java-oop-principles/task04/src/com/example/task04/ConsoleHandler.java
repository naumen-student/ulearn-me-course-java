package com.example.task04;

public class ConsoleHandler implements MessageHandler {
    @Override
    public void HandleMessage(String t, Object... messageArgs) {
        System.out.println(String.format(t, messageArgs));
    }
}
