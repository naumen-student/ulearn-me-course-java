package com.example.task04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {
    private ChronoUnit chronoUnit;
    private final String path;
    private final String name;

    public RotationFileHandler(String name, String path, ChronoUnit chronoUnit) {
        this.chronoUnit = chronoUnit;
        this.name = name;
        this.path = path;
    }

    public void setChronoUnit(ChronoUnit unit) {
        this.chronoUnit = unit;
    }

    @Override
    public void log(Logger.Level level, String message) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy.MM.dd_hh.mm.ss");
        LocalDateTime now = LocalDateTime.now().truncatedTo(chronoUnit);
        FileHandler fileHandler = new FileHandler(name, String.format("%s\\%s.txt", path, now.format(pattern)));
        fileHandler.log(level, message);
    }

    @Override
    public void log(Logger.Level level, String format, Object... args) {
        log(level, String.format(format, args));
    }
}
