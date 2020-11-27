package com.example.task02;

class TimeSpan {
    private int seconds, minutes, hours;

    public TimeSpan(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }
    public int getHours()
    {
        return hours;
    }
    void add(TimeSpan time)
    {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
    }
    void subtract(TimeSpan time)
    {
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
    }
    public String toString()
    {
        return String.format("",hours,minutes,seconds);
    }
} 