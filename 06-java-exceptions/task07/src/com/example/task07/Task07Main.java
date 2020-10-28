package com.example.task07;

public class Task07Main {

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
        } catch (RuntimeException e) {
            return "unchecked";
        } catch (Exception e) {
            return "checked";
        }
        return "none";
    }

}