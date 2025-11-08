package ict._21.classnames;

public class SumClass {
    public static SumClass instance = new SumClass();

    private SumClass() {}

    public double sumSeries() {
        double sum = 0.0;
        for (double i = 1.0; i >= 0.01; i -= 0.1) {
            sum += i;
        }
        return Math.round(sum * 100.0) / 100.0; // round to 2 decimals
    }
}
