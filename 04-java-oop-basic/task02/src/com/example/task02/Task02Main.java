package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hour = hours;
        this.minute = minutes;
        this.second = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void add(TimeSpan timeSpan) {
        hour += timeSpan.hour;
        minute += timeSpan.minute;
        second += timeSpan.second;
    }

    public void subtract(TimeSpan timeSpan) {
        hour -= timeSpan.hour;
        minute -= timeSpan.minute;
        second -= timeSpan.second;
    }

    @Override
    public String toString() {
        return String.format("%d, %d, %d", second, minute, hour);
    }
}