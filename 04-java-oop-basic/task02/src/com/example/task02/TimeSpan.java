package com.example.task02;

public class TimeSpan {
    private int seconds, minets, hours;

    public TimeSpan(int seconds, int minets, int hours){
        this.seconds = seconds;
        this.minets = minets;
        this.hours = hours;
    }

    public void add(TimeSpan time){
        seconds += time.getSeconds();
        minets += time.getMinets();
        hours += time.getHours();
    }

    public void subtract(TimeSpan time){
        seconds -= time.getSeconds();
        minets -= time.getMinets();
        hours -= time.getHours();
    }

    public String toString(){
        return String.format("Hours: %d, Minets: %d, Seconds: %d", hours, minets, seconds);
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }

    public int getMinets(){
        return minets;
    }

    public void setMinets(int minets){
        this.minets = minets;
    }

    public int getHours(){
        return hours;
    }

    //public void setHours(int hours){
      //  this.hours = hours;
   // }
}
