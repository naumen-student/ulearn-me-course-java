package com.example.task04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RotationFileHandler implements MessageHandler {
    public void log(String message) throws FileNotFoundException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String str = dateFormat.format(date);
        File f = new File(str+".txt");
        PrintWriter fout = new PrintWriter(str+".txt");
        fout.println(message);
        fout.close();
    }
}