    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return "FALSE";
        boolean flag = true;
        while (x > 0) {
            int n = x % 10;
            if (n % 2 != 0) {
                flag = false;
                break;
            }
            x /= 10;
        }
        return flag ? "TRUE" : "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
