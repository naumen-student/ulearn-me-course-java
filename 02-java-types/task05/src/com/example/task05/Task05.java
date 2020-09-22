package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String st = Integer.toString(x);

        for(int i=0;i<st.length();i++){
            char c = st.charAt(i);

            switch (c){
                case '1':
                case '5':
                case '3':
                case '7':
                case '9':
                    return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(462);
        System.out.println(result);

    }

}
