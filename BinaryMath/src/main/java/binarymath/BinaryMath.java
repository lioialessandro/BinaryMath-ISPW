package binarymath;

public class BinaryMath {
    private int convertBinaryToDecimal(Integer number) {
        return Integer.parseInt(number.toString(), 10);
    }

    public int binarySum(int binaryA, int binaryB){
        int decimalA = convertBinaryToDecimal(binaryA);
        int decimalB = convertBinaryToDecimal(binaryB);
        int sum = decimalA + decimalB;
        return Integer.parseInt(Integer.toString(sum), 2);
    }

    public int binarySubtraction(int binaryA, int binaryB){
        int decimalA = convertBinaryToDecimal(binaryA);
        int decimalB = convertBinaryToDecimal(binaryB);
        int result = decimalA - decimalB;
        return Integer.parseInt(Integer.toString(result), 2);
    }

    public int binaryMultiplication(int binaryA, int binaryB){
        int decimalA = convertBinaryToDecimal(binaryA);
        int decimalB = convertBinaryToDecimal(binaryB);
        int result = decimalA * decimalB;
        return Integer.parseInt(Integer.toString(result), 2);
    }

    public int binaryDivision(int binaryA, int binaryB){
        int decimalA = convertBinaryToDecimal(binaryA);
        int decimalB = convertBinaryToDecimal(binaryB);
        int result = decimalA / decimalB;
        return Integer.parseInt(Integer.toString(result), 2);
    }
}
