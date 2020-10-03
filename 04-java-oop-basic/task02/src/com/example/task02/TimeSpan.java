package com.example.task02;

public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }

    public void setHours(int hours){
        this.hours = hours;
    }
    public int getHours(){
        return hours;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public int getMinutes(){
        return minutes;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    public int getSeconds(){
        return seconds;
    }

    public void add(TimeSpan time){
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        boundingInInterval();
    }

    public void subtract(TimeSpan time){
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
    }

    public String toString(){
        return "(" + hours + ":" + minutes + ":" + seconds + ")";
    }

    public void boundingInInterval() {
        hours = (hours + minutes / 60) % 24;
        minutes = (minutes + seconds / 60) % 60;
        seconds = seconds % 60;
    }
}
