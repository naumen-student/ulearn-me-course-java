package com.example.task02;

class TimeSpan {

    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int hours, int minutes, int second) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = second;
    }

    public void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;
    }

    public void subtract(TimeSpan time) {
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -= time.hours;
    }

    public String toString() {
        return String.format("(%dч:%dм:%dс)", hours, minutes, seconds);
    }
}