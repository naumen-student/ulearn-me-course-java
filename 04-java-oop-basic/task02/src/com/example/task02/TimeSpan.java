package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void add(TimeSpan timeSpan) {
        seconds += timeSpan.seconds;
        minutes += timeSpan.minutes;
        hours += timeSpan.hours;
        normalizeTimespan();
    }


    public void subtract(TimeSpan timeSpan) {
        seconds -= timeSpan.seconds;
        minutes -= timeSpan.minutes;
        hours -= timeSpan.hours;
        normalizeTimespan();
    }

    private void normalizeTimespan() {
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
    }

    @Override
    public String toString() {
        return String.format("Timespan{hours: %d, minutes: %d, seconds: %d}", hours, minutes, seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}