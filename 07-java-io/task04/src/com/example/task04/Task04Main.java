package com.example.task04;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task04Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in).
                useDelimiter(Pattern.compile("( |\\n)"));

        Pattern pattern = Pattern.compile("[\\d+|.|e|-]+");
        double sum=0;
        String readied;

        while (sc.hasNext())
            if (pattern.matcher(readied = sc.next()).matches())
                sum+=Double.parseDouble(readied);

        DecimalFormat  formatter = new DecimalFormat("0.000000",new DecimalFormatSymbols(Locale.US));
        System.out.println(formatter.format(sum));
    }
}