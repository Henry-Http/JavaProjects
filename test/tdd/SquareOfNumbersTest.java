import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SquareOfNumbersTest {
    SquareOfNumbers square;
    @BeforeEach
    void startAllTestWith() {
        square = new SquareOfNumbers();
    }
    @Test

    void testThatObjectIsNotNull() {
        assertNotNull(square);
    }

    @Test
    void testThatNumberSquareWorks() {
        assertEquals(36, square.squareOfNumberOne(6));
        assertEquals(25, square.squareOfNumberTwo(5));

    }

    @Test
    void testThatSquareAdds() {
        assertEquals(10, square.addSquares(5,5));
    }

    @Test
    void testThatSquareSubtracts() {
        assertEquals(10, square.subtractSquares(20, 10));
    }

}

