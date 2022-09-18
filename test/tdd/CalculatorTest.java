package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
  Calculator calculator;

  @BeforeEach
  void startAllTestWith() {
     calculator = new Calculator();
  }

  @Test
    void testThatObjectExist() {
      assertNotNull(calculator);
  }
  @Test
    void sum() {
      assertEquals(8, calculator.addTwoNumbers(5,3));
  }

  @Test
  void minus() {
    assertEquals(2, calculator.minusTwoNumbers(5,3));
  }

  @Test
  void multiply() {
    assertEquals(15, calculator.multiplyTwoNumbers(5,3));
  }

  @Test

  void divide() {
    assertEquals(10, calculator.divide(20,2));
  }


}
