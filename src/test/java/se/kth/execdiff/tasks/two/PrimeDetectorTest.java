package se.kth.execdiff.tasks.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeDetectorTest {
    @Test
    void test_primeFactorOfFour(){
        assertEquals(2, PrimeDetector.getSmallestPrimeFactor(16));
    }
}
