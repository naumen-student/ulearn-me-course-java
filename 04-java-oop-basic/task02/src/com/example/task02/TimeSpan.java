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

    public void setHours() {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes() {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }

    public void setSeconds() {
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
    }

    void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
    }

    public String toString() {
        return String.format("{1}:{2}:{3}",hours,minutes,seconds);
    }
}
