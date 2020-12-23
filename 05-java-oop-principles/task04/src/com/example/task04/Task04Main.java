package com.example.task04;

import com.example.task04.enums.LogLevel;
import com.example.task04.handlers.ConsoleHandler;
import com.example.task04.handlers.MemoryHandler;

public class Task04Main {
    public static void main(String[] args) {
        Logger myLogger = Logger.getLogger("TestLogger");

        myLogger.addHandler(new ConsoleHandler());
        myLogger.addHandler(new MemoryHandler(new ConsoleHandler(),60));

        System.out.println("firstLogging");
        myLogger.debug("123");
        System.out.println("secondLogging");
        myLogger.debug("456");


        myLogger.removeAllHandlers();
        myLogger.setLevel(LogLevel.Error);
        myLogger.addHandler(new ConsoleHandler());

        myLogger.debug("IDebug");
        myLogger.error("IError");
    }
}
