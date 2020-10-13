package com.example.task04;

public class ConsoleHandler extends Logger implements MessageHandler {
    ConsoleHandler(String loggerName) {
        super(loggerName);
    }

    @Override
    public void log(Level loggingLevel, String message, Object... args) {
        if (loggingLevel.ordinal() >= this.loggingLevel.ordinal()) {
            System.out.print(super.messageBuild(loggingLevel, message, args));
        }
    }

    @Override
    public void debug(String message, Object... args) {
        log(Level.DEBUG, message, args);
    }

}
