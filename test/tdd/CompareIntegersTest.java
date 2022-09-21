package tdd;

import chapter2.CompareIntegers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareIntegersTest {
    CompareIntegers arithmetic;

    @BeforeEach
    public void startAllTestWith() {
        arithmetic = new CompareIntegers();
    }

    @Test
    void objectExists() {
        assertNotNull(arithmetic);
    }

    @Test
    void SquareOfInteger() {
        assertEquals(4, arithmetic.SquareOfNUm(2));
    }

    @Test
    void numIsLessThan100() {
        assertTrue(arithmetic.numIsLessThan100(20));
    }


    @Test
    void NumIsGreaterThan100() {
        assertFalse(arithmetic.NumIsGreaterThan100(7));
    }
    @Test
    void NumIsNotEqualTo100(){
        assertTrue(arithmetic.NumIsNotEqualTo100(170));
    }

    @Test
    void NumIsEqualTo100(){
        assertTrue(arithmetic.NumIsEqualTo100(100));
    }
    @Test
    void squareOfNumIsEqualTo100() {
        assertTrue(arithmetic.squareOfNumIsEqualTo100(10));
    }
    @Test
    void squareOfNumIsNotEqualTo100() {
        assertTrue(arithmetic.squareOfNumIsNotEqualTo100(120));
    }
    @Test
    void squareOfNumIsGreaterThan100() {
        assertTrue(arithmetic.squareOfNumIsGreaterThan100(11));
    }
    @Test
    void squareOfNumIsLessThan100() {
        assertFalse(arithmetic.squareOfNumIsLessThan100(11));
    }



}