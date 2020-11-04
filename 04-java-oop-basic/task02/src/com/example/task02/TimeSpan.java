package com.example.task02;

public class TimeSpan {
    private int seconds, minets, hours;

    public TimeSpan(int seconds, int minets, int hours) {
        this.seconds = seconds;
        this.minets = minets;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinets() {
        return minets;
    }
    public int getHours()
    {
        return hours;
    }
    void add(TimeSpan time)
    {
    hours += time.hours;
    minets += time.minets;
    seconds += time.seconds;
    }
    void subtract(TimeSpan time)
    {
        hours -= time.hours;
        minets -= time.minets;
        seconds -= time.seconds;
    }
    public String toString()
    {
    return String.format("",hours,minets,seconds);
    }
}
