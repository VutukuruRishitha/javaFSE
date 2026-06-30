package testingjunit;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        int result = c.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        int result = c.multiply(2, 4);
        assertEquals(8, result);
    }
}