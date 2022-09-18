package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    public void testSquareFunction() {
        Math math = new Math();
        int result = math.squareOf(5);
        assertEquals(25, result);
    }

    @Test
    public void testAddFunction(){
        Math math = new Math();
        assertEquals(6, math.add(3,3));

    }

}