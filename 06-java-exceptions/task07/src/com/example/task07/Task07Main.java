package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";
    public Processor processor;

    public static void main(String[] args) { }

    public String getExceptionType() {
        try {
            processor.process();
        } catch (RuntimeException e) {
            return UNCHECKED;
        } catch (Exception e) {
            return CHECKED;
        }
        return NONE;
    }

}