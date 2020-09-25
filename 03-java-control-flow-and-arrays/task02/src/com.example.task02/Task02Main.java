package com.example.task02;

import java.util.Arrays;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(15));
    }

    static String getSeason(int monthNumber) {
        List<String> seasons = Arrays.asList("весна","лето", "осень", "зима");
        int offset = 1;
        int seasonLengthInMonths = 3;
        int seasonsCount = seasons.toArray().length;
        for (int i = offset; i < seasonsCount + offset; i++){
            int monthNumberLeftSide = (i * seasonLengthInMonths) -offset;
            if(monthNumber > monthNumberLeftSide && monthNumber < monthNumberLeftSide+4)
                return seasons.get(i-offset);
        }
        return seasons.get(seasonsCount-1);
    }
}