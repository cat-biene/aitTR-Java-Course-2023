package homework.prime;

import homework.prime.PrimeNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers primeNumbers;

    @BeforeEach
    void setUp() {
        primeNumbers = new PrimeNumbers();
    }

    @Test
    void primeNumbers() {

        // is not prime
        assertFalse(primeNumbers.isPrime(4));
        assertFalse(primeNumbers.isPrime(8));
        assertFalse(primeNumbers.isPrime(0));
        assertFalse(primeNumbers.isPrime(-10));

        // is prime
        assertTrue(primeNumbers.isPrime(3));
        assertTrue(primeNumbers.isPrime(7));
    }
}