package homework.primeNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {

    PrimeNumber primeNumber;

    @BeforeEach
    void setUp() {
        primeNumber = new PrimeNumber();
    }

    @Test
    void isPrimeTest() {
        int n = 20;
        assertFalse(primeNumber.isPrime(n));
        n = 19;
        assertTrue(primeNumber.isPrime(n));
    }
}
