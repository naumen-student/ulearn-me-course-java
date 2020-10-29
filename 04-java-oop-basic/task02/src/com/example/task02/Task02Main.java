package com.example.task02;

class TimeSpan{
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

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void add(TimeSpan time) {
        this.seconds += time.seconds;
        if (seconds >= 60) {
            seconds -= 60;
            minutes += 1;
        }

        this.minutes += time.minutes;
        if (minutes >= 60) {
            minutes -= 60;
            hours += 1;
        }

        this.hours += time.hours;
        if (hours >= 24)
            hours -= 24;
    }

    public void subtract(TimeSpan time) {
        this.seconds -= time.seconds;
        if (seconds < 0) {
            seconds += 60;
            minutes -= 1;
        }

        this.minutes -= time.minutes;
        if (minutes < 0) {
            minutes += 60;
            hours -= 1;
        }

        this.hours -= time.hours;
        if (hours < 0)
            hours += 24;
    }

    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}