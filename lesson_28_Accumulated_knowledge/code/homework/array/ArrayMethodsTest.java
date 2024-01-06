package homework.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    ArrayMethods arrayMethods;
    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    void sumArray() {
        int[] numbers = {2,4,6,3,5};
        assertEquals(20,arrayMethods.sumArray(numbers));
    }

    @Test
    void indexOfElement() {
        int[] numbers = {2,4,6,3,5};
        assertEquals(1, arrayMethods.indexOfElement(numbers, 4));
    }
}