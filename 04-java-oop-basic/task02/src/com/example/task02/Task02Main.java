package com.example.task02;

class TimeSpan{
    private int seconds, minutes, hours;

    public TimeSpan(int seconds, int minutes, int hours){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
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

    public int getSeconds(){
        return seconds;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getHours(){
        return hours;
    }

    public void add(TimeSpan time){
        seconds += time.seconds;
        minutes += time.minutes;
        hours += time.hours;
    }

    public void subtract(TimeSpan time){
        seconds -= time.seconds;
        minutes -= time.minutes;
        hours -= time.hours;
    }

    public String toString() {
        return String.format("", seconds, minutes, hours);
    }
}