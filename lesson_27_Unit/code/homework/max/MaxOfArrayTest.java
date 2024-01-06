package homework.max;

import homework.max.MaxOfArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxOfArrayTest {

    // fields
    MaxOfArray maxOfArray;
    @BeforeEach
    void setUp() {
        maxOfArray = new MaxOfArray();
    }

    @Test
    void maxOfArray() {
        int[] arr = {-50, 100, 1, 15, -64, 85, -3};
        assertEquals(1, maxOfArray.maxOfArray(arr));
    }
}