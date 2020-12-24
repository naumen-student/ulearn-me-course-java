package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {

        try {
            processor.process();
        } catch (RuntimeException ex) {
            return UNCHECKED;
        } catch (Exception ex) {
            return CHECKED;
        }
        return NONE;
    }

}