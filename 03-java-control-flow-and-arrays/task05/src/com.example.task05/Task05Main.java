public class Task05Main
{
    public static void main(String[] args)
    {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMin(5,4,3));
         */
    }

    static int getMin(int a, int b, int c)
    {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        return 0;
        if (a<b && a<c)
            return a;
        if (b<a & b <c)
            return  b;
        else
            return c;
    }
}
