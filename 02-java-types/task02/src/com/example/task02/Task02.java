public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        double d = Double.parseDouble(input);
        if (d <= Byte.MAX_VALUE && d >= Byte.MIN_VALUE)
            return "byte";
        else if (d <= Short.MAX_VALUE && d >= Short.MIN_VALUE)
            return "short";
        else if (d <= Integer.MAX_VALUE && d >= Integer.MIN_VALUE)
            return "int";
        else if ( d <= Long.MAX_VALUE && d >= Long.MIN_VALUE)
            return "long";
        return "";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*

        String result = solution("12345");
        System.out.println(result);
         */

    }

}