package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Logger logger = new Logger(" gg");
        logger.log(Level.ERROR, "fr343", 0, false);
        logger.log(Level.ERROR, "fr454", 2, false);
    }
}
