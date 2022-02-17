package binarymath;

// 14 9

public class BinaryMath {
    private int convertBinaryToDecimal(Integer number) {
        return Integer.parseInt(number.toString(), 10);
    }

    public int binarySum(int binaryA, int binaryB) {
//        Convert input  to decimal
        int decimalA = convertBinaryToDecimal(binaryA);
        int decimalB = convertBinaryToDecimal(binaryB);
//        Execute operation
        int result = decimalA + decimalB;
//        Convert to binary and return
        return Integer.parseInt(Integer.toBinaryString(result));
    }

    public int binarySubtraction(int binaryA, int binaryB) {
//        Convert input  to decimal
        int decimalA = convertBinaryToDecimal(binaryA);
        int decimalB = convertBinaryToDecimal(binaryB);
//        Execute operation
        int result = decimalA - decimalB;
//        Convert to binary and return
        return Integer.parseInt(Integer.toBinaryString(result));
    }

    public int binaryMultiplication(int binaryA, int binaryB) {
//        Convert input  to decimal
        int decimalA = convertBinaryToDecimal(binaryA);
        int decimalB = convertBinaryToDecimal(binaryB);
//        Execute operation
        int result = decimalA * decimalB;
//        Convert to binary and return
        return Integer.parseInt(Integer.toBinaryString(result));
    }

    public int binaryDivision(int binaryA, int binaryB) {
//        Convert input  to decimal
        int decimalA = convertBinaryToDecimal(binaryA);
        int decimalB = convertBinaryToDecimal(binaryB);
//        Execute operation
        int result = decimalA / decimalB;
//        Convert to binary and return
        return Integer.parseInt(Integer.toBinaryString(result));
    }
}
