package homework.comparator;
// Write OddEvenComparator implementing Comparator with the method compare for sorting an array of Integers in the order: The even integers should go before odd numbers.

// Update OddEvenComparator with the method compare for sorting an array of Integers in the order: The even integers should go before odd numbers in the ascending order . The odd integers should go after the even ones in the descending order. Write Junit Test Case for OddEvenComparator.
//Integer[] origin = { 1, 4, 3, 2, 5, 6, 9, 8, 7, 3 };
//Integer[] expected = { 2, 4, 6, 8, 9, 7, 5, 3, 3, 1 };
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class OddEvenComparatorTest {
    Integer[] integer;

    @BeforeEach
    void setUp() {
    }

    @Test
    void comparator() {
        Integer[] origin = {1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
        Integer[] expected = {2, 4, 6, 8, 9, 7, 5, 3, 3, 1};
        Comparator<Integer> comparator = (n1, n2) -> {
            if (n1 % 2 == 0 && n2 % 2 != 0) {
                return -1;
            }
            if (n1 % 2 != 0 && n2 % 2 == 0) {
                return 1;
            }
            return 0;
        };
        Arrays.sort(origin, comparator);
        System.out.println(Arrays.toString(origin));

    }

    @Test
    void comparator2() {
        Integer[] origin = {1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
        Integer[] expected = {2, 4, 6, 8, 9, 7, 5, 3, 3, 1};
        Comparator<Integer> comparator = (n1, n2) -> {
            if (n1 % 2 == 0 && n2 % 2 != 0) {
                return -1;
            }
            if (n1 % 2 != 0 && n2 % 2 == 0) {
                return 1;
            }
            if (n1 % 2 == 0 && n2 % 2 == 0) {
                return n1 - n2;
            }
            if (n1 % 2 != 0 && n2 % 2 != 0) {
                return n2 - n1;
            }
            return 0;
        };
        Arrays.sort(origin, comparator);
        System.out.println(Arrays.toString(origin));
    }
}