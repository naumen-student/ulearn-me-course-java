package com.example.task02;

public class TimeSpan {

    private int second;
    private int minutes;
    private int hours;

    public TimeSpan(int hours, int minutes, int second) {
        this.hours = hours;
        this.minutes = minutes;
        this.second = second;
    }

    public void add(TimeSpan time) {
        second += time.second;
        minutes += time.minutes;
        hours += time.hours;
    }

    public void subtract(TimeSpan time) {
        second -= time.second;
        minutes -= time.minutes;
        hours -= time.hours;
    }

    public String toString() {
        return String.format("(%d:%d:%d)", hours, minutes,second);
    }
}
