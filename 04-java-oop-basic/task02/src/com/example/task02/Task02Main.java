package com.example.task02;

class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int seconds, int minets, int hours) {
        this.seconds = seconds;
        this.minutes = minets;
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
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    void add(TimeSpan time)
    {
        hours = hours + time.hours;
        minutes =minutes + time.minutes;
        seconds =seconds + time.seconds;
    }
    void subtract(TimeSpan time)
    {
        hours =hours - time.hours;
        minutes =minutes - time.minutes;
        seconds =seconds - time.seconds;
    }
    public String toString()
    {
        return String.format("",hours,minutes,seconds);
    }
}