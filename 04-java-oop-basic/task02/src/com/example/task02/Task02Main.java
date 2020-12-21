package com.example.task02;

class TimeSpan
{
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int hours, int minutes, int second)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = second;
    }

    public int getHours()
    {
        return hours;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public void subtract(TimeSpan time)
    {
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -= time.hours;
    }

    public void add(TimeSpan time)
    {
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;
    }

    public String toString()
    {
        return String.format("(%d:%d:%d)", hours, minutes, seconds);
    }
}