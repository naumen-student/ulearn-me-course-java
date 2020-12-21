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
        if (minutes < 60)
            this.minutes = minutes;
        else throw new IllegalArgumentException();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 60)
            this.seconds = seconds;
        else throw new IllegalArgumentException();
    }

    int allToSeconds() {
        return 360 * hours + 60 * minutes + seconds;
    }

    void add(TimeSpan time) {
        int allToSec = allToSeconds() + time.allToSeconds();
        seconds = allToSec % 60;
        minutes = (allToSec / 60) % 60;
        hours = allToSec / 360;
    }

    void subtract(TimeSpan time) {
        int allToSec = allToSeconds() - time.allToSeconds();
        if (allToSec < 0) {
            throw new ArithmeticException();
        }
        seconds = allToSec % 60;
        minutes = (allToSec / 60) % 60;
        hours = allToSec / 360;
    }

    public String toString() {
        return String.format("%1$:%2$:%3$", hours, minutes, seconds);
    }
}
