package com.example.task04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleHandler implements MessageHandler {
    private final String name;

    public ConsoleHandler(String name) {
        this.name = name;
    }

    @Override
    public void log(Level severityLevel, String message) {
        System.out.printf("[%s] %s %s - %s%n", severityLevel.toString()
                , new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date()), name, message);
    }

    @Override
    public void log(Level severityLevel, String template, Object... args) {
        log(severityLevel, String.format(template, args));
    }
}
