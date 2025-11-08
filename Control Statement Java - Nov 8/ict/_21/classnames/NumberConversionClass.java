package ict._21.classnames;

public class NumberConversionClass {
    public static NumberConversionClass convert = new NumberConversionClass();

    private NumberConversionClass() {}

    public String decimalToBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public String decimalToHex(int n) {
        return Integer.toHexString(n);
    }

    public String decimalToOctal(int n) {
        return Integer.toOctalString(n);
    }

    public int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }
}
