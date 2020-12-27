package com.example.task02;

public class TimeSpan {
    private int seconds, minets, hours;

    public TimeSpan(int sec, int minute, int hours) {
        this.sec = sec;
        this.minute = minute;
        this.hours = hours;
    }

    public void add(TimeSpan time) {
        sec = sec + time.getSeconds();
        minute = minute + time.getMinets();
        hours = hours + time.getHours();
    }

    public void subtract(TimeSpan time) {
        sec = sec - time.getSeconds();
        minute = minute - time.getMinets();
        hours = hours - time.getHours();
    }

    public String toString() {
        return String.format("Hours: %d, Minets: %d, Seconds: %d", hours, minute, sec);
    }

    public int getSeconds() {
        return sec;
    }

    public void setSeconds(int sec) {
        this.sec = sec;
    }

    public int getMinets() {
        return minute;
    }

    public void setMinets(int minute) {
        this.minute = minute;
    }

    public int getHours() {
        return hours;
    }
}