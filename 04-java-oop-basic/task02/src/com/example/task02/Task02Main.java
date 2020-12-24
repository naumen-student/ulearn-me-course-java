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

    public void getHours(int hours) {
        this.hours = hours;
    }

    public int setHours() {
        return this.hours;
    }

    public void getMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int setMinutes() {
        return this.minutes;
    }

    public void getSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int setSeconds() {
        return this.seconds;
    }

    public void add(TimeSpan time) {
        change(time, 1);
    }

    public void subtract(TimeSpan time) {
        change(time, -1);
    }

    private void change(TimeSpan time, int sign) {
        this.hours += sign * time.hours;
        this.minutes += sign * time.minutes;
        this.seconds += sign * time.seconds;

        if (this.seconds < 0) {
            this.minutes -= 1;
            this.seconds += 60;
        }

        if (this.seconds > 59) {
            this.minutes += 1;
            this.seconds -= 60;
        }

        if (this.minutes < 0) {
            this.hours -= 1;
            this.minutes += 60;
        }

        if (this.minutes > 59) {
            this.hours += 1;
            this.minutes -= 60;
        }
    }

    public String toString() {
        String h = hours > 9 ? String.valueOf(hours) : "0" + hours;
        String m = minutes > 9 ? String.valueOf(minutes) : "0" + minutes;
        String s = seconds > 9 ? String.valueOf(seconds) : "0" + seconds;
        return String.format("%s:%s:%s", h, m, s);
    }
}