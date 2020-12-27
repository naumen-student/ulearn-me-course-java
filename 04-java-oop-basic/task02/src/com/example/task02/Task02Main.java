package com.example.task02;

class TimeSpan {
    private int h;
    private int m;
    private int s;
    public TimeSpan(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getHours() {
        return h;
    }

    public void setHours(int h) {
        this.h = h;
    }

    public int getMinutes() {
        return m;
    }

    public void setMinutes(int m) {
        this.m = m;
    }

    public int getSeconds() {
        return s;
    }

    public void setSeconds(int s) {
        this.s = s;
    }

    void getNormalizeTime() {
        m += s / 60;
        s = s % 60;
        h += m / 60;
        m = m % 60;
    }

    void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        getNormalizeTime();
    }

    void subtract(TimeSpan time) {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
        getNormalizeTime();
    }

    public String toString() {
        return String.format("h: %d, m: %d, s: %d", hours, minutes, seconds);
    }
}