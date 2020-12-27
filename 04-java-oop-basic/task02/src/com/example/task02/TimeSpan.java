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

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return this.hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void add(TimeSpan time) {
        this.seconds += time.seconds;
        if (this.seconds / 60 > 0) {
            this.minutes += this.seconds / 60;
        }

        this.minutes += time.minutes;
        if (this.minutes / 60 > 0) {
            this.hours += this.minutes / 60;
        }

        this.hours += time.hours;
    }

    public void subtract(TimeSpan time) {
        this.hours -= time.hours;
        if (this.minutes - time.minutes < 0) {
            --this.hours;
            this.minutes -= time.minutes - 60;
        }

        if (this.seconds - time.seconds < 0) {
            --this.minutes;
            this.seconds -= time.seconds - 60;
        }

    }

    public String toString() {
        return String.format("h: %d, m: %d, s: %d", this.hours, this.minutes, this.seconds);
    }

}
