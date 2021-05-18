import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute() {
        int number = 0;
        int expected = 0;
        AbsoluteNumberCalculator abs = new AbsoluteNumberCalculator();
        int result = abs.findAbsolute( number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;
        AbsoluteNumberCalculator abs1=new AbsoluteNumberCalculator();
        int result = abs1.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute2() {
        int number = 2;
        int expected = 2;
        AbsoluteNumberCalculator abs2=new AbsoluteNumberCalculator();
        int result = abs2.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute3() {
        int number = -1;
        int expected = 1;
        AbsoluteNumberCalculator abs3=new AbsoluteNumberCalculator();
        int result = abs3.findAbsolute(number);
        assertEquals(expected, result);
    }
}
