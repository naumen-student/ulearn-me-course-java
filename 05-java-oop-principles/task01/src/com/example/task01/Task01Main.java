package com.example.task01;

public class Task01Main {

    public static void main(String[] args) {
        final Logger logger = Logger.getLogger("testLogger");
        logger.debug("Exception on None.java at line 43");
        logger.setLevel(Level.ERROR);
        logger.info("I hope that i am not displayed on cmd");
        final Logger logger2 = Logger.getLogger("testLogger");
        System.out.println(logger2 == logger? "Logger is created before" : "Your code sucks");
        logger2.error("After change link");
    }
}
