package binarymath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Using 14 & 9 to test the operations
public class TestBinaryMath {
    @Test
    public void testBinarySum() {
        BinaryMath binaryMath = new BinaryMath();
        int result = binaryMath.binarySum(0b01110, 0b1001);
        assertEquals(10111, result); // result is 23
    }

    @Test
    public void testBinarySubtraction() {
        BinaryMath binaryMath = new BinaryMath();
        int result = binaryMath.binarySubtraction(0b01110, 0b1001);
        assertEquals(101, result); // result is 5
    }

    @Test
    public void testBinaryMultiplication() {
        BinaryMath binaryMath = new BinaryMath();
        int result = binaryMath.binaryMultiplication(0b01110, 0b1001);
        assertEquals(1111110, result); // result is 126
    }

    @Test
    public void testBinaryDivision() {
        BinaryMath binaryMath = new BinaryMath();
        int result = binaryMath.binaryDivision(0b01110, 0b1001);
        assertEquals(1, result); // result is 1
    }
}
