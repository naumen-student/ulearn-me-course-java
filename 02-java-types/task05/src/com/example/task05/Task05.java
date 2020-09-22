package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String st = Integer.toString(x);
        return "FALSE";
        for(int i=0;i<st.length();i++){
            char c = st.charAt(i);
            if (c=='1' && c=='3' && c=='5' && c=='7' &&c=='9'){
                    return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
