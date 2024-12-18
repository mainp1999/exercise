import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getResult() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getResult());
    }

    @Test
    void add() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.add(-5);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.multiply(2);
        calculator.multiply(-3);
        assertEquals(-30, calculator.getResult());
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.subtract(5);
        assertEquals(5, calculator.getResult());
    }
}

