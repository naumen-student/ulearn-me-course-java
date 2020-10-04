package com.example.task02;
public class TimeSpan {
    private int timeFromSeconds;
    private int timeFromMinutes;
    private int timeFromHours;

    public TimeSpan( int timeFromHours, int timeFromMinutes, int timeFromSeconds){
        this.timeFromHours = timeFromHours;
        this.timeFromMinutes = timeFromMinutes;
        this.timeFromSeconds = timeFromSeconds;
        balanceSeconds();
        balanceMinutes();
    }

    private void balanceMinutes() {
        int countHoursInMinutes = timeFromMinutes / 60;
        if (countHoursInMinutes > 0){
            timeFromHours += countHoursInMinutes;
            timeFromMinutes -= countHoursInMinutes * 60;
        }
    }

    private void balanceSeconds() {
        int countMinutesInSeconds = timeFromSeconds / 60;
        if (countMinutesInSeconds > 0){
            this.timeFromMinutes += countMinutesInSeconds;
            this.timeFromSeconds -= countMinutesInSeconds * 60;
        }
    }

    public int getSeconds(){
        return timeFromSeconds;
    }

    public int getMinutes(){
        return timeFromMinutes;
    }

    public int getHours(){
        return timeFromHours;
    }

    public void setSeconds(int seconds){
        timeFromSeconds += seconds;
        balanceSeconds();
        balanceMinutes();
    }

    public void setMinutes(int minutes){
        timeFromMinutes += minutes;
        balanceMinutes();
    }

    public void setHours(int hours){
        timeFromHours += hours;
    }

    public void add(TimeSpan time){
        timeFromSeconds += time.getSeconds();
        timeFromMinutes += time.getMinutes();
        timeFromHours += time.getHours();
        balanceSeconds();
        balanceMinutes();
    }

    public void subtract(TimeSpan time){
        if (timeFromSeconds < time.getSeconds()) {
            timeFromMinutes -= 1;
            timeFromSeconds = 0;
        }
        else timeFromSeconds -= time.getSeconds();

        if (timeFromMinutes < time.getMinutes()) {
            timeFromHours -= 1;
            timeFromMinutes = 0;
        }
        else
            timeFromMinutes -= time.getMinutes();
        timeFromHours -= time.getHours();
        balanceSeconds();
        balanceMinutes();
    }

    public String toString(){
        return String.format("%d:%d:%d", timeFromHours, timeFromMinutes, timeFromSeconds);
    }
}
