package com.example.task02;

public class TimeSpan {
    private int seconds;
    private  int minutes;
    private  int hours;

    TimeSpan(int seconds, int minutes, int hours) {
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

    void add(TimeSpan time) {
        seconds += time.seconds;
        if (seconds >= 60) {
            seconds %= 60;
            minutes += 1;
        }
        minutes += time.minutes;
        if (minutes >= 60) {
            minutes %= 60;
            hours += 1;
        }
        hours += time.hours;
    }

    void subtract(TimeSpan time) {
        seconds -= time.seconds;
        if (seconds < 0) {
            seconds = 60 + seconds;
            minutes -= 1;
        }
        minutes -= time.minutes;
        if (minutes < 0) {
            minutes = 60 + minutes;
            hours -= 1;
        }
        hours -= time.hours;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
