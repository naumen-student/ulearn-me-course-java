package com.example.task02;

class TimeSpan{

    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void add(TimeSpan time) {
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        redistribution();
    }

    public void subtract(TimeSpan time) {
        TimeSpan temp = this;
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
        if (redistribution()) {
            System.out.println("Преобразование выполнено успешно");
        }
        else {
            System.out.println("Преобразование невозможно и не будет выполнено");
            hours = temp.hours;
            minutes = temp.minutes;
            seconds = temp.seconds;
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

    private boolean redistribution() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
        if (hours < 0) {
            return false;
        }
        if (minutes < 0) {
            if (hours < Math.abs(minutes / 60) + 1) {
                return false;
            }
            else {
                hours -= Math.abs(minutes / 60) + 1;
                minutes += (Math.abs(minutes / 60) + 1) * 60;
            }
        }
        if (seconds < 0) {
            if (minutes < Math.abs(seconds / 60) + 1) {
                return false;
            }
            else {
                minutes -= Math.abs(seconds / 60) + 1;
                seconds += (Math.abs(seconds / 60) + 1) * 60;
            }
        }
        return true;
    }
}

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(1, 2 ,3);
        System.out.println(time.toString());
        time.add(new TimeSpan(50, 50,181));
        System.out.println(time.toString());
        time.subtract(new TimeSpan(10, 10 ,10));
        System.out.println(time.toString());
    }
}
