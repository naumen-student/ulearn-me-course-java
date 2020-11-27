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

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public void add(TimeSpan time){
        hours += time.hours;
        minutes += time.hours;
        seconds += time.seconds;
        normalize();
    }

    public void subtract(TimeSpan time){
        hours -= time.hours;
        minutes -= time.hours;
        seconds -= time.seconds;
        normalize();
    }

    private void normalize(){
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
        hours = hours % 24;
    }

    public String toString(){
        return String.format("Hours:%d, Minutes:%d, Seconds:%d", hours, minutes, seconds);
    }
}
