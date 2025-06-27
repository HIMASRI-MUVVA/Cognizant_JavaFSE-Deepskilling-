package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAddPositiveNumbers() {
        Main main = new Main();
        int result = main.add(10, 15);
        assertEquals("Adding 10 + 15 should be 25", 30, result);
    }

    @Test
    public void testAddZero() {
        Main main = new Main();
        int result = main.add(0, 0);
        assertEquals("Adding 0 + 0 should be 0", 0, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        Main main = new Main();
        int result = main.add(-5, -3);
        assertEquals("Adding -5 + -3 should be -8", -8, result);
    }
}

