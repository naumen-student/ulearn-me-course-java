package com.example.task03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Pattern;

public class Task03Main {

    public static void main(String[] args) throws IOException {
    }

    public static List<Set<String>> findAnagrams(InputStream inputStream, Charset charset) {
        Scanner scanner = new Scanner(inputStream, charset.name());
        Map<String, Set<String>> newDict = new HashMap<>();
        Pattern pattern = Pattern.compile("[" + "а-яА-ЯёЁ" + "]" + "*");

        while (scanner.hasNextLine()){
            String str = scanner.nextLine().toLowerCase();

            if(str.length() > 2 && pattern.matcher(str).matches()){
                if(newDict.size() == 0){
                    Set<String> set = new HashSet<>();
                    set.add(str);
                    newDict.put(str, set);
                    continue;
                }
            }
            else {
                continue;
            }

            boolean added = false;

            for(String key : newDict.keySet()){
                if(algorithmAnagrams(str, key)){
                    Set<String> list = newDict.get(key);
                    list.add(str);
                    newDict.put(key, list);
                    added = true;
                    break;
                }
            }

            if(!added){
                Set<String> set = new HashSet<>();
                set.add(str);
                newDict.put(str, set);
            }

        }

        List<Set<String>> needList = new ArrayList<>();

        for (Set<String> value : newDict.values()){
            if(value.size() > 1){
                needList.add(new TreeSet<String>(value));
            }
        }

        return needList;
    }

    public static boolean algorithmAnagrams(String str1, String str2){
        char[] firstArray = str1.toCharArray();
        char[] secondArray = str2.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return (new String(firstArray)).equals(new String(secondArray));
    }
}
