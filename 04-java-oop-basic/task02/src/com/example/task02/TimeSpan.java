package com.example.task02;

import java.security.InvalidParameterException;

public class TimeSpan {
    private  int hours;
    private  int minutes;
    private  int seconds;

    public  TimeSpan(int hours,int minutes,int seconds)
    {
        this.minutes=minutes;
        this.hours=hours;
        this.seconds=seconds;
        RemoveOverflowUp();
    }

    public  void add(TimeSpan time)
    {
        this.hours+=time.hours;
        this.minutes+=time.minutes;
        this.seconds+=time.seconds;
        RemoveOverflowUp();
    }

    public  void subtract(TimeSpan time)
    {
        this.seconds-=time.seconds;
        this.minutes-=time.minutes;
        this.hours-=time.hours;
        RemoveOverflowDown();
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    private void RemoveOverflowUp()
    {
        if (seconds>=60)
        {
            minutes+=seconds/60;
            seconds%=60;
        }
        if (minutes>=60)
        {
            hours+=minutes/60;
            minutes%=60;
        }
    }

    private  void RemoveOverflowDown()
    {
        if (seconds<0)
        {
            seconds+=60;
            minutes--;
        }
        if (minutes<0)
        {
            minutes+=60;
            hours--;
        }
        if(hours<0)
            throw new UnsupportedOperationException("hours<0");
    }
}
