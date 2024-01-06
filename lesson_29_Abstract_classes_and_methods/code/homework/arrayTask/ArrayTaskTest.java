package homework.arrayTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTaskTest {

    ArrayTask arrayTask;
    @BeforeEach
    void setUp() {
        arrayTask = new ArrayTask();
    }

    @Test
    void averageEvenElementsTest() {
        int[] arr = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        double result = arrayTask.averageEvenElements(arr);
        System.out.println("Result: " + result);
        assertEquals(11.0, result, 0.001);
    }
}
