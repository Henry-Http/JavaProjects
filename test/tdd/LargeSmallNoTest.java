package tdd;

import chapter2.LargeSmallNo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargeSmallNoTest {
    LargeSmallNo arithmetic;
    @BeforeEach
    void startAllTestWIth() {
        arithmetic = new LargeSmallNo();
    }

    @Test
    void checkThatObjectExists(){
        LargeSmallNo arithmetic = new LargeSmallNo();
    }
    @Test
    void sum(){
        assertEquals(20, arithmetic.sum(10,5,5));
    }
    @Test
    void average(){
        assertEquals(39,arithmetic.average(24,42,53));
    }
    @Test
    void product(){
        assertEquals(72,arithmetic.product(12,2,3));
    }
    @Test
    void largestFirstNumber1(){
        assertTrue(arithmetic.largestNo1(12, 3, 4));
    }
    @Test
    void largestSecondNumber1(){
        arithmetic.largestNo1(1,9,77);
        assertTrue(true);
    }
}