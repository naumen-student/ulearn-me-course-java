package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

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

    TimeSpan(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    void add(TimeSpan time) {
        seconds += time.seconds;
        minutes += seconds / 60;
        seconds %= 60;
        minutes += time.minutes;
        hours += minutes / 60;
        minutes %= 60;
        hours += time.hours;
    }

    void subtract(TimeSpan time) {
        seconds -= time.seconds;
        minutes += seconds / 60;
        if (seconds < 0) {
            seconds = 60 + seconds % 60;
        }
        minutes -= time.minutes;
        hours += minutes / 60;
        if (minutes < 0) {
            minutes = 60 + minutes % 60;
        }
        hours -= time.hours;
    }

    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}
