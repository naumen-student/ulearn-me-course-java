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

        if (this.seconds >= 60) {
            this.minutes += 1;
            this.seconds -= 60;
        }

        if (this.minutes < 0) {
            this.hours -= 1;
            this.minutes += 60;
        }

        if (this.minutes >= 60) {
            this.hours += 1;
            this.minutes -= 60;
        }
    }

    @Override
    public String toString() {
        String h = hours > 9 ? String.valueOf(hours) : "0" + hours;
        String m = minutes > 9 ? String.valueOf(minutes) : "0" + minutes;
        String s = seconds > 9 ? String.valueOf(seconds) : "0" + seconds;
        return String.format("%s:%s:%s", h, m, s);
    }
}