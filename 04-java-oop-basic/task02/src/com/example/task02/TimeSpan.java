package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //метод приводит время в стандартный вид
    //минуты и часы не больше 60: иначе добавляем часы/минуты
    //этот же метод гарантирует неотрицательность времени
    private void normalizeTime(){
        if (second >= 60) {
            minute += second / 60;
            second %= 60;
        }
        if (minute >= 60){
            hour += minute / 60;
            minute %= 60;
        }
        if(second < 0){
            minute -= 1+(second/60);
            second += 60;
        }
        if(minute < 0){
            hour -= 1+(-minute/60);
            minute += 60;
        }
        if(hour < 0) {
            hour = minute = second = 0;
        }
    }


    public void setSecond(int second) {
        this.second = second;
        normalizeTime();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        normalizeTime();
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public TimeSpan(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        normalizeTime();
    }

    public void add(TimeSpan time){
        second += time.second;
        minute += time.minute;
        hour += time.hour;
        normalizeTime();
    }

    public void subtract(TimeSpan time){
        second -= time.second;
        minute -= time.minute;
        hour -= time.hour;
        normalizeTime();
    }

    public String toString(){
        return String.format("%d:%d:%d", hour, minute, second);
    }
}
