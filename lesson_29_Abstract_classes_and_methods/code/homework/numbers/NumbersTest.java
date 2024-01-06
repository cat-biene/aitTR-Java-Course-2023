package homework.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers;

    @BeforeEach
    void setUp() {
        numbers = new Numbers();
    }

    @Test
    void averageNumbers() {
        int[] num = {8, 4, 3, 5};
        assertEquals(6, numbers.averageNumbers(num));
    }
}