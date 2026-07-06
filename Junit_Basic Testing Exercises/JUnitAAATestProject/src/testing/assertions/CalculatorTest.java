package testing.assertions;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
public class CalculatorTest {
private Calculator calculator;
@Before
public void setUp() {
    calculator = new Calculator();
    System.out.println("Setup: Calculator object created");
}
@After
public void tearDown() {
    calculator = null;
    System.out.println("Teardown: Calculator object destroyed");
}
@Test
public void testAddition() {
    int a = 2;
    int b = 3;
    int result = calculator.add(a, b);
    assertEquals(5, result);
}
@Test
public void testMultiplication() {
    int a = 2;
    int b = 4;
    int result = calculator.multiply(a, b);
    assertEquals(8, result);
}
}
class Calculator {
public int add(int a, int b) {
    return a + b;
}
public int multiply(int a, int b) {
    return a * b;
}
}
