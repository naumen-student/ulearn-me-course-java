package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan(int hours, int minutes, int secs) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = secs;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
    }

    void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
    }

    public String toString() {
        return String.format("hours: %d, minutes: %d, seconds: %d", hours, minutes, seconds);
    }
}
