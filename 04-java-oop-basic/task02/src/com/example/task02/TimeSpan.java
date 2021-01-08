package com.example.task02;
public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        balanceSeconds();
        balanceMinutes();
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

    public void setSeconds(int seconds){
        this.seconds += seconds;
        balanceSeconds();
        balanceMinutes();
    }

    public void setMinutes(int minutes){
        this.minutes += minutes;
        balanceMinutes();
    }

    public void setHours(int hours){
        this.hours += hours;
    }

    public void add(TimeSpan time){
        seconds += time.getSeconds();
        minutes += time.getMinutes();
        hours += time.getHours();
        balanceSeconds();
        balanceMinutes();
    }

    public void subtract(TimeSpan time){
        if (seconds < time.getSeconds()) {
            minutes -= 1;
            seconds = 0;
        }
        else seconds -= time.getSeconds();

        if (minutes < time.getMinutes()) {
            hours -= 1;
            minutes = 0;
        }
        else
            minutes -= time.getMinutes();
        hours -= time.getHours();
        balanceSeconds();
        balanceMinutes();
    }

    public String toString(){

        return String.format("%d:%d:%d", hours, minutes, seconds);
    }

    private void balanceMinutes() {
        int countHoursInMinutes = minutes / 60;
        if (countHoursInMinutes > 0){
            hours += countHoursInMinutes;
            minutes -= countHoursInMinutes * 60;
        }
    }

    private void balanceSeconds() {
        int countMinutesInSeconds = seconds / 60;
        if (countMinutesInSeconds > 0){
            this.minutes += countMinutesInSeconds;
            this.seconds -= countMinutesInSeconds * 60;
        }
    }
}
