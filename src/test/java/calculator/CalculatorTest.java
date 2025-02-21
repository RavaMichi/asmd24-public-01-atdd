package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @Test
    void acceptanceTest(){
        calculator.enter(5);
        assertEquals(5, calculator.getResult());

        calculator.enter(6);
        calculator.add();
        assertEquals(11, calculator.getResult());

        calculator.enter(3);
        calculator.add();
        assertEquals(14, calculator.getResult());
        assertEquals(14, calculator.getResult());

        calculator.enter(3);
        assertThrows(IllegalStateException.class, () -> calculator.enter(5));
    }

    @Test
    void testMultiplicationWithTwoNumbers() {
        calculator.enter(5);
        calculator.enter(-6);
        calculator.multiply();

        assertEquals(-30, calculator.getResult());
    }

    @Test
    void testErrorOnMultiplicationWithOneNumber() {
        calculator.enter(5);

        assertThrows(IllegalStateException.class, calculator::multiply);
    }

    @Test
    void testErrorOnMultiplicationWithNoNumber() {
        assertThrows(IllegalStateException.class, calculator::multiply);
    }

    @Test
    void testDivisionWithTwoNumbers() {
        calculator.enter(10);
        calculator.enter(5);
        calculator.divide();

        assertEquals(2, calculator.getResult());
    }
}
