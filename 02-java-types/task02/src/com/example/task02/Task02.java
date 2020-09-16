package com.example.task02;

import java.security.InvalidParameterException;

public class Task02 {

    public static String solution(String input)
    {
        Long parsed = LongTryParse(input);
        return  GetNumericType(parsed);
    }

    private  static  long LongTryParse(String input)
    {
        try
        { return  Long.parseLong(input); }
        catch (Exception e)
        { throw new InvalidParameterException(input+"Is InCorrect or more than Long.MaxValue"); }
    }

    private  static  String GetNumericType(Long number)
    {
        if (number>=Byte.MIN_VALUE&& number<=Byte.MAX_VALUE)
            return  "byte";
        else if (number>=Short.MIN_VALUE&&number<=Short.MAX_VALUE)
            return "short";
        else if (number>=Integer.MIN_VALUE&&number<=Integer.MAX_VALUE)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args)
    { }
}
