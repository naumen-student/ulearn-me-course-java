package com.example.task04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task04Main {

    public static void main(String[] args) {

        Map<String, Integer> result = new HashMap<>();
        new Scanner(System.in).useDelimiter(Pattern.compile("[.,:;'!?_ \n\\-\"]"))
                .tokens()
                .map(String::toLowerCase)
                .filter(x -> !x.equals(""))
                .forEach(x -> {
                    if (result.containsKey(x)) result.put(x, result.get(x) + 1);
                    else result.put(x, 1);
                });
        result
                .entrySet()
                .stream()
                .sorted((x, y) ->
                        (x.getValue().equals(y.getValue())
                                ?
                                CharSequence.compare(x.getKey(), y.getKey())
                                :
                                Integer.compare(y.getValue(), x.getValue())))
                .limit(10)
                .forEachOrdered(x -> System.out.print(x.getKey() + "\n"));
    }

    }

}
