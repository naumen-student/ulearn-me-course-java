package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan (int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        hours = (hours * 3600 + time.hours * 3600) / 3600;
        minutes = (minutes * 60 + time.minutes * 60) / 60;
        seconds += time.seconds;
    }

    void subtract(TimeSpan time) {
        hours = (hours * 3600 - time.hours * 3600) / 3600;
        minutes = (minutes * 60 - time.minutes * 60) / 60;
        seconds -= time.seconds;
    }

    public String toString() {
        return String.format("h: %d, m: %d, s: %d", hours, minutes, seconds);
    }
}
