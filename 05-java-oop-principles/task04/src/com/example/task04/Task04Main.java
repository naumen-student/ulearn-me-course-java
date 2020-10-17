package com.example.task04;

import java.time.temporal.ChronoUnit;

public class Task04Main {
    public static void main(String[] args) {
        Logger logger = new Logger("CurrentEntity");
        logger.setLevel(Level.DEBUG);
        logger.addMessageHandler(new RotationFileHandler(logger.getName(), ChronoUnit.MINUTES, "text"
                , ".txt"));
        logger.addMessageHandler(new ConsoleHandler(logger.getName()));
        logger.addMessageHandler(new MemoryHandler(new FileHandler(logger.getName(), "text1.txt"), 1));
        logger.info("Information");
        logger.warning("Warning");
    }
}
