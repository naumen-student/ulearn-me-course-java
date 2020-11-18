package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Logger testLogger = new Logger("TestLogger");
        testLogger.setLevel(Logger.LogLevel.INFO);
        testLogger.log(Logger.LogLevel.DEBUG, "test message");
        testLogger.setLevel(Logger.LogLevel.DEBUG);
        testLogger.log(Logger.LogLevel.DEBUG, "test message");

        Logger testLogger2 = Logger.getLogger("TestLogger");
        testLogger2.debug("Logger2!");
        testLogger.error("error");
        testLogger.setLevel(Logger.LogLevel.INFO);
        testLogger2.debug("LOGGER2");
        testLogger2.info("info");
    }
}
