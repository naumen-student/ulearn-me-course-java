package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        try
        {
            processor.process();
        } catch (Exception e)
        {
            if (e instanceof RuntimeException)
                return UNCHECKED;
            return CHECKED;
        }
        return NONE;
    }

}