package ict._21.classnames;

public class DivisorMultipleClass {
    public static DivisorMultipleClass instance = new DivisorMultipleClass();

    private DivisorMultipleClass() {}

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
