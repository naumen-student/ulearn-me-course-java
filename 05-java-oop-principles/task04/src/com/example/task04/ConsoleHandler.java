package com.example.task04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConsoleHandler implements MessageHandler{
    private final String name;

    public ConsoleHandler(String name) {
        this.name = name;
    }

    @Override
    public void log(Logger.Level level, String message) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, dateFormat.format(new Date()), name, message);
        System.out.println(result);
    }

    @Override
    public void log(Logger.Level level, String format, Object... args) {
        log(level, String.format(format, args));
    }
}
