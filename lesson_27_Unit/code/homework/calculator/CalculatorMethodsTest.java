package homework.calculator;

import homework.calculator.CalculatorMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorMethodsTest {

    CalculatorMethods calculatorMethods;
    @BeforeEach
    void setUp() {
        calculatorMethods = new CalculatorMethods();
    }

    @Test
    void sumNumbers() {
        int a = 5;
        int b = 5;
        assertEquals(10, calculatorMethods.sumNumbers(a,b));
    }

    @Test
    void subtractionNumbers() {
        int a = 25;
        int b = 20;
        assertEquals(5, calculatorMethods.subtractionNumbers(a,b));
    }

    @Test
    void multiplicationNumbers() {
        int a = 2;
        int b = 2;
        assertEquals(4, calculatorMethods.multiplicationNumbers(a,b));
    }

    @Test
    void divisionNumbers() {
        int a = 10;
        int b = 2;
        assertEquals(5, calculatorMethods.divisionNumbers(a,b));
    }

    @Test
    void divWithRemNumbers() {
        int a = 11;
        int b = 2;
        assertEquals(1, calculatorMethods.divWithRemNumbers(a,b));
    }
}