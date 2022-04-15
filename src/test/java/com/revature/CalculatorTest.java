package com.revature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

    private final Calculator cal = new Calculator();


    /*
    * Develop a Calculator class using TDD!
    - The Calculator should take a String and resolve it into a number, e.g. “5 + 11” = 16
    - Perhaps use StringBuilder to rip the string apart
    - The Calculator should have one method - e.g. Calculator.calculate(String s) - that resolves
    which method to use based on the input
    - Your calculator need only recognize 5 operators: +, -, *, /, and %
    - You must write the tests before you write the bodies of your methods to practice TDD!
    - Two options for TDD:
    - Create the Calculator class and declare all of your methods first with empty bodies,
    then write the tests, then write the bodies
    - Create Calculator as an interface, write the test using the interface, create a class that
    implements the interface, then modify the test class to use an instance of that class
* */

    @Test
    public void initialization() {
        assertNotNull(cal);
    }

    @Test
    public void addition() {
        assertEquals(2, cal.calculate("1 + 1"));
        assertEquals(1, cal.calculate("0 + 1"));
        assertEquals(1, cal.calculate("1 + 0"));
        assertEquals(0, cal.calculate("0 + 0"));
    }

    @Test
    public void subtraction() {
        assertEquals(0, cal.calculate("1 - 1"));
        assertEquals(-1, cal.calculate("0 - 1"));
        assertEquals(1, cal.calculate("1 - 0"));
        assertEquals(0, cal.calculate("0 - 0"));
    }

    @Test
    public void multiplication() {
        assertEquals(2, cal.calculate("2 * 1"));
        assertEquals(0, cal.calculate("0 * 1"));
        assertEquals(0, cal.calculate("0 * -1"));
        assertEquals(2, cal.calculate("1 * 2"));
        assertEquals(1, cal.calculate("-1 * -1"));
        assertEquals(-1, cal.calculate("1 * -1"));
    }

    @Test
    public void division() {
        assertEquals(2, cal.calculate("2 / 1"));
        assertEquals(0, cal.calculate("0 / 1"));
        assertEquals(0, cal.calculate("0 / -1"));
        assertEquals(1, cal.calculate("-1 / -1"));
        assertEquals(-1, cal.calculate("1 / -1"));
    }

    @Test
    public void modulo() {
        assertEquals(0, cal.calculate("1 % 1"));
        assertEquals(1, cal.calculate("1 % 2"));
        assertEquals(1, cal.calculate("1 % 3"));
        assertEquals(2, cal.calculate("2 % 3"));
        assertEquals(0, cal.calculate("3 % 1"));
    }
}
