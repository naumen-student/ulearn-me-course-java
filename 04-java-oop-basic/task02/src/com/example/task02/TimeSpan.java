package com.example.task02;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

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

    public void setHours(int value) {
        hours = value;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int value) {
        if (value < 0 || value > 59) {
            throw new ValueException("Value should be higher or equals to 0 and less then 60");
        }
        minutes = value;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int value) {
        if (value < 0 || value > 59) {
            throw new ValueException("Value should be higher or equals to 0 and less then 60");
        }
        seconds = value;
    }

    public void add(TimeSpan time) {
        seconds += time.seconds;
        if (seconds > 59) {
            minutes += seconds / 60;
            seconds %= 60;
        }

        minutes += time.minutes;
        if (minutes > 59) {
            hours += minutes / 60;
            minutes %= 60;
        }

        hours += time.hours;
    }


    public void subtract(TimeSpan time) {
        if ((seconds - time.seconds < 0 && minutes - time.minutes - 1 < 0 && hours - time.hours - 1 < 0)
                || (minutes - time.minutes < 0 && hours - time.hours - 1 < 0)
                || hours - time.hours < 0) {
            throw new ValueException("Too big time span");
        }

        seconds -= time.seconds;
        if (seconds < 0) {
            seconds += (59 - seconds);
            minutes -= 1;
        }

        minutes -= time.minutes;
        if (minutes < 0) {
            minutes += (59 - minutes);
            hours -= 1;
        }

        hours -= time.hours;
    }

    public String toString(){
        return String.format("%d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}
