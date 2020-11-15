package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int value){
        hours = value;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int value){
        minutes = value;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int value){
        seconds = value;
    }

    void add(TimeSpan time){
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
    }

    void subtract(TimeSpan time){
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
    }

    public String toString(){
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }

}
