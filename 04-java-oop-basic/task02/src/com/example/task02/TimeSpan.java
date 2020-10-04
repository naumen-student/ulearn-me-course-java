package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
       return hours;
    }

    public void setHours(int value) {
        hours = value;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int value) {
        minutes = value;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int value) {
        seconds = value;
    }

    void add(TimeSpan time) {
        setHours(getHours() + time.getHours());
        setMinutes(getMinutes() + time.getMinutes());
        setSeconds(getSeconds() + time.getSeconds());
    }

    void subtract(TimeSpan time) {
        setHours(getHours() - time.getHours());
        setMinutes(getMinutes() - time.getMinutes());
        setSeconds(getSeconds() - time.getSeconds());
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", getHours(),getMinutes(), getSeconds());
    }
}
