package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minute;
    private int seconds;

    public int getHours() {
        return this.hours;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public TimeSpan(int hours, int minute, int seconds) {
        this.hours = hours;
        this.minute = minute;
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minute += time.minute;
        this.seconds += time.seconds;
    }

    void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minute -= time.minute;
        this.seconds -= time.seconds;
    }

    public String toString() {
        return String.format("%d ч. %d мин. %d сек.", hours, minute, seconds);
    }
}
