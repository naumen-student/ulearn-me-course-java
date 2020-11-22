package com.example.task04;

import java.time.temporal.ChronoUnit;

public class Task04Main {
    public static void main(String[] args) {

        Logger test = new Logger("test");
        test.setLevel(Logger.Level.DEBUG);
        test.addHandler(new ConsoleHandler(test));
        test.addHandler(new FileHandler(test, "info.txt"));
        test.addHandler(new RotationFileHandler(test, "log", ChronoUnit.MINUTES));
        test.error("This is error");
        test.debug("Nice debug dude");
    }
}