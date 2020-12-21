package com.example.task02;

public class TimeSpan {
    private int hours, minutes, seconds;


    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
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

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
        if (this.minutes >= 60) {
            this.hours += 1;
            this.minutes -= 60;
        }
        if (this.seconds >= 60) {
            this.minutes += 1;
            this.seconds -= 60;
        }
    }

    void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
        if (this.minutes <= 0) {
            this.hours -= 1;
            this.minutes += 60;
        }
        if (this.seconds >= 60) {
            this.minutes -= 1;
            this.seconds += 60;
        }
    }

    public String toString() {
        return String.format("%h:%m:%s", this.hours, this.minutes, this.seconds);
    }
}
