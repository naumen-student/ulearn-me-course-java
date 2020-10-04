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
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private void add(TimeSpan time) {
        hours += time.getHours();
        minutes += time.getMinutes();
        seconds += time.getSeconds();
    }

    private void subtract(TimeSpan time) {
        hours -= time.getHours();
        minutes -= time.getMinutes();
        seconds -= time.getSeconds();
    }

    public String toString() {
        return String.format("%d h. %d m. %d s.", hours, minutes, seconds);
    }
}
