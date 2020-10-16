package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class RotationFileHandler implements MessageHandler {

    LocalTime localTime;

    public RotationFileHandler(LocalTime localTime) {
        this.localTime = localTime;
    }

    @Override
    public void logMessage(String message) {
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now().plusHours(localTime.getHour()).minusMinutes(localTime.getMinute());
        String dateTime = LocalDateTime.of(nowDate, nowTime).toString();
        try {
            FileWriter fileWriter = new FileWriter(String.format("log from %s", dateTime), false);
            fileWriter.write(message);
            fileWriter.flush();
        } catch (IOException ioException) {
            System.out.println(ioException.toString());
        }
    }
}
