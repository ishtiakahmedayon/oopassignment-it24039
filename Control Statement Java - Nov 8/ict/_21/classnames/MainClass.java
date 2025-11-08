package ict._21.classnames;

public class MainClass {
    public static void main(String[] args) {
        

        // 1. SumClass
        double sum = SumClass.instance.sumSeries();
        CustomPrintClass.a.pr("Sum of series 1+0.9+...+0.01 = " + sum);

        // 2. DivisorMultipleClass
        int a = 12, b = 18;
        int gcd = DivisorMultipleClass.instance.gcd(a, b);
        int lcm = DivisorMultipleClass.instance.lcm(a, b);
        CustomPrintClass.a.pr("GCD of " + a + " and " + b + " = " + gcd);
        CustomPrintClass.a.pr("LCM of " + a + " and " + b + " = " + lcm);

        // 3. NumberConversionClass
        int number = 255;
        String binary = NumberConversionClass.convert.decimalToBinary(number);
        String hex = NumberConversionClass.convert.decimalToHex(number);
        String octal = NumberConversionClass.convert.decimalToOctal(number);

        CustomPrintClass.a.pr(number + " in binary = " + binary);
        CustomPrintClass.a.pr(number + " in hexadecimal = " + hex);
        CustomPrintClass.a.pr(number + " in octal = " + octal);

        // Decimal back from other bases
        CustomPrintClass.a.pr("Binary " + binary + " to decimal = " +
                NumberConversionClass.convert.binaryToDecimal(binary));
        CustomPrintClass.a.pr("Hex " + hex + " to decimal = " +
                NumberConversionClass.convert.hexToDecimal(hex));
        CustomPrintClass.a.pr("Octal " + octal + " to decimal = " +
                NumberConversionClass.convert.octalToDecimal(octal));
    }
}
