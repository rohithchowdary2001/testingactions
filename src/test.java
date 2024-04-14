import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(8, 3);
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 6);
        assertEquals(24, result);
    }

    @Test
    public void testDivisionByNonZero() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10.0, 2.0);
        assertEquals(5.0, result);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10.0, 0.0);
        } catch (IllegalArgumentException e) {
            assertEquals("Division by zero is not allowed", e.getMessage());
        }
    }
}

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}
