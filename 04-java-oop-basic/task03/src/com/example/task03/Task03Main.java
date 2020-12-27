public class Task03Main {
    public static void main(String[] args) {

        Complex a = new Complex(4, 5);
        Complex b = new Complex(12, 23);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.Add(b).toString());
        System.out.println(a.Multiply(b).toString());
    }
}