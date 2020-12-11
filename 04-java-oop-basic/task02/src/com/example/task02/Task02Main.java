package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public TimeSpan(int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void add(TimeSpan time) {
        this.seconds += time.seconds;
        this.minutes += time.minutes;
        this.hours += time.hours;
    }

    public void subtract(TimeSpan time) {
        this.seconds -= time.seconds;
        this.minutes -= time.minutes;
        this.hours -= time.hours;
    }

    public String toString() {
        return String.format("%d, %d, %d", hours, minutes, seconds);
    }

}