package com.example.task04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {
    private ChronoUnit chronoUnit;
    private final String path;
    private final Logger logger;

    public RotationFileHandler(Logger logger, String path, ChronoUnit chronoUnit) {
        this.chronoUnit = chronoUnit;
        this.logger = logger;
        this.path = path;
    }

    public void setChronoUnit(ChronoUnit unit) {
        this.chronoUnit = unit;
    }

    @Override
    public void log(Logger.Level level, String message) {
        String timeNow = LocalDateTime.now().truncatedTo(chronoUnit).format(DateTimeFormatter.ofPattern("yyyy.MM.dd_hh.mm.ss"));
        FileHandler fileHandler = new FileHandler(logger, String.format("%s_%s.txt", path, timeNow));
        fileHandler.log(level, message);
    }

    @Override
    public void log(Logger.Level level, String pattern, Object... args) {
        log(level, String.format(pattern, args));
    }
}
