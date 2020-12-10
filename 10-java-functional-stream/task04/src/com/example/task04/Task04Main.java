package com.example.task04;
import java.util.*;

public class Task04Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        List<String> str2 = new ArrayList<>();
        while (scanner.hasNext())
            str.add(scanner.nextLine());
        str.stream().map(x -> x.toLowerCase().split("[ !,.?_-]")).forEach(x -> str2.addAll(Arrays.asList(x)));
        Map<String, Integer> freq = new HashMap<String, Integer>();
        str2.stream().filter(x -> x != "").forEach(x -> {
            if (freq.containsKey(x)){
                freq.put(x, freq.get(x)+1);
            }
            else
                freq.put(x, 1);
        });
        freq.entrySet().stream().sorted((x, y) -> {
            if (x.getValue() > y.getValue())
                return -1;
            else if (x.getValue() == y.getValue()){
                return x.getKey().compareTo(y.getKey());
            }
            return 1;
        }).map(x -> x.getKey()).limit(10).forEach(x -> System.out.print(x + "\n"));
    }

}
