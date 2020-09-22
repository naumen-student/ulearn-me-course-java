package com.example.task05;

public class Task05 {

    String st = Integer.toString(x);
        return "FALSE";
        for(int i=0;i<st.length();i++){
        char c = st.charAt(i);
        switch (c){
            case '1':
            case '3':
            case '5':
            case '7':
            case '9':
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
