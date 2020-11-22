package com.example.task04;

import java.time.temporal.ChronoUnit;

public class Task04Main
{
    public static void main(String[] args)
    {
        Logger test = new Logger("test");
        test.addHandler(new ConsoleHandler(test));
        test.addHandler(new FileHandler(test, "info.txt"));
        test.addHandler(new RotationFileHandler(test, "log", ChronoUnit.MINUTES));
        test.error("Error");
        test.debug("Debug");
    }
}
